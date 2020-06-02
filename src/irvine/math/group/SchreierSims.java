/*
 * Redberry: symbolic tensor computations.
 *
 * Copyright (c) 2010-2015:
 *   Stanislav Poslavsky   <stvlpos@mail.ru>
 *   Bolotin Dmitriy       <bolotin.dmitriy@gmail.com>
 *
 * This file is part of Redberry.
 *
 * Redberry is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Redberry is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Redberry. If not, see <http://www.gnu.org/licenses/>.
 */
package irvine.math.group;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;

/**
 * Algorithms for constructing, modifying and manipulating base and strong generating set (BSGS) of permutation group
 * including Schreier-Sims algorithm and its randomized versions, algorithms for changing base of BSGS, algorithms for
 * creating BSGS of symmetric and alternating groups and other utility methods.
 * <p><b>BSGS data structure</b>
 * The data structure used for representing BSGS is an array list of
 * BSGS elements; <i>i-th</i> item in this list
 * contains <i>i-th</i> base point and <i>i-th</i> basic stabilizer in stabilizers chain (pointwise stabilizer of all
 * points before <i>i-th</i> point, exclusive), represented by its generators.
 * </p>
 * <p> The BSGS structure appears in two forms:
 * <i>mutable</i> --- {@code ArrayList<BaseStrongGeneratingCandidateElement>} and <i>immutable</i> --- {@code List<BaseStrongGeneratingElement>}
 * (unmodifiable). The first form is used as a candidate BSGS of permutation group, while the second everywhere
 * considered as a valid BSGS.
 *
 * @author Dmitry Bolotin
 * @author Stanislav Poslavsky
 */
public final class SchreierSims {

  // Original implementation taken from Redberry and modified for this project by Sean A. Irvine.
  // http://redberry.cc
  // Large commented out sections not currently needed here.

  private SchreierSims() {
  }

  private static final class StripContainer {
    private final int mTerminationLevel;
    private final IntegerPermutation mRemainder;

    private StripContainer(final int terminationLevel, final IntegerPermutation remainder) {
      mTerminationLevel = terminationLevel;
      mRemainder = remainder;
    }
  }

  /**
   * Calculates representation of specified permutation in terms of specified BSGS. If specified permutation can be
   * represented in terms of specified BSGS, then the produced remainder will be identity and {@code mTerminationLevel}
   * equals to BSGS size. If produced {@code mRemainder} is not identity then it fixes all base points in specified
   * BSGS (hence permutation does not belong to group). If {@code mTerminationLevel} is less then BSGS size, then
   * specified permutation does not  belong to group and produced remainder is a unique generator that should be
   * placed at {@code mTerminationLevel} in specified BSGS in order to extend group such that it will contain
   * specified permutation.
   * <p>
   * The algorithm is a straightforward implementation of STRIP described in Sec. 4.4.1 of <b>[Holt05]</b>.
   * @param bsgs base strong generating set
   * @param permutation the permutation
   * @return termination level and remainder
   */
  public static StripContainer strip(final List<? extends BaseStrongGeneratingElement> bsgs, IntegerPermutation permutation) {
    //loop over all base points
    for (int i = 0, size = bsgs.size(); i < size; ++i) {
      //image of current base point under the permutation
      final int beta = permutation.image(bsgs.get(i).mBasePoint);
      //test whether this image belongs to the orbit
      if (!bsgs.get(i).belongsToOrbit(beta)) {
        //if not, then permutation cannot be represented in terms of specified BSGS
        return new StripContainer(i, permutation);
      }
      //strip
      permutation = permutation.compose(bsgs.get(i).getInverseTransversalOf(beta));
    }
    return new StripContainer(bsgs.size(), permutation);
  }

//    /**
//     * Returns whether specified permutation belongs to permutation group defined by specified base and strong
//     * generating set.
//     *
//     * @param BSGS        base and strong generating set
//     * @param permutation permutation
//     * @return true if specified permutation belongs to permutation group defined by specified base and strong
//     * generating set and false otherwise
//     */
//    public static boolean membershipTest(final List<? extends BaseStrongGeneratingElement> BSGS, IntegerPermutation permutation) {
//        StripContainer sc = strip(BSGS, permutation);
//        return sc.mTerminationLevel == BSGS.size() && sc.mRemainder.isIdentity();
//    }

//  /**
//   * Creates a raw BSGS candidate represented as list. This method simply takes all distinct points that can be
//   * mapped onto another points under any of generators and adjoins these points to a base. If generating set is
//   * empty or it fixes all points, then this method returns {@code Collections.EMPTY_LIST}, otherwise it returns an
//   * {@code ArrayList} which can be further used in Schreier-Sims algorithm.
//   * @param generators group generators
//   * @return raw BSGS candidate
//   */
//  public static List<BaseStrongGeneratingCandidateElement> createRawBSGSCandidate(final IntegerPermutation... generators) {
//    return createRawBSGSCandidate(Arrays.asList(generators));
//  }

  /**
   * Creates a raw BSGS candidate represented as list. This method simply takes all distinct points that can be
   * mapped onto another points under any of generators and adjoins these points to a base. If generating set is
   * empty or it fixes all points, then this method returns {@code Collections.EMPTY_LIST}, otherwise it returns an
   * {@code ArrayList} which can be further used in Schreier-Sims algorithm.
   * @param generators group generators
   * @return raw BSGS candidate
   */
  public static List<BaseStrongGeneratingCandidateElement> createRawBSGSCandidate(final List<IntegerPermutation> generators) {
    return createRawBSGSCandidate(generators, IntegerPermutation.degree(generators));
  }


  /**
   * Creates a raw BSGS candidate represented as list. This method simply takes all distinct points that can be
   * mapped onto another points under any of generators and adjoins these points to a base. If generating set is
   * empty or it fixes all points, then this method returns {@code Collections.EMPTY_LIST}, otherwise it returns an
   * {@code ArrayList} which can be further used in Schreier-Sims algorithm.
   * @param generators group generators
   * @param degree degree of group used to create Schreier vectors of proper length
   * @return raw BSGS candidate
   */
  public static List<BaseStrongGeneratingCandidateElement> createRawBSGSCandidate(final List<IntegerPermutation> generators, final int degree) {
    if (degree == 0) {
      return Collections.emptyList();
    }

    // first let's find a "proto-base" - a set of points that cannot be fixed by any of specified generators
    // and a "proto-BSGS" corresponding to this base

    // at the moment our "proto-base" will contain only one point
    int firstBasePoint = -1;

    // we try to find such a point that is not fixed at least by one of the generators
    out:
    for (final IntegerPermutation permutation : generators) {
      for (int i = 0; i < degree; ++i) {
        if (permutation.image(i) != i) {
          firstBasePoint = i;
          break out;
        }
      }
    }

    if (firstBasePoint == -1) {
      // there is no any point that is not fixed by all generators, i.e. all generators are identities
      return Collections.emptyList();
    }

    // our "proto-BSGS" with only one element
    // corresponding G^(i) is G^(0) = G, so its stabilizer generators (stabilizes zero points)
    // are just generators of group
    final ArrayList<BaseStrongGeneratingCandidateElement> bsgs = new ArrayList<>();
    bsgs.add(new BaseStrongGeneratingCandidateElement(firstBasePoint, new ArrayList<>(generators), degree));

    // make use all unused generators
    makeUseOfAllGenerators(bsgs);
    return bsgs;
  }

  /**
   * Creates a raw BSGS candidate represented as list. This method simply adds to {@code knownBase} all distinct
   * points that can be mapped onto another points under any of generators. Those points in {@code knownBase} that are
   * fixed by all generators will not be taken into account.  If generating set is empty, or it fixes all points,
   * then this method returns {@code Collections.EMPTY_LIST}, otherwise it returns an {@code ArrayList} which can be
   * further used in Schreier-Sims algorithm.
   * @param knownBase some proposed base points
   * @param generators group generators
   * @return raw BSGS candidate
   */
  public static List<BaseStrongGeneratingCandidateElement> createRawBSGSCandidate(final int[] knownBase, final List<IntegerPermutation> generators) {
    return createRawBSGSCandidate(knownBase, generators, IntegerPermutation.degree(generators));
  }

  /**
   * Creates a raw BSGS candidate represented as list. This method simply adds to {@code knownBase} all distinct
   * points that can be mapped onto another points under any of generators. Those points in {@code knownBase} that are
   * fixed by all generators will not be taken into account.  If generating set is empty, or it fixes all points,
   * then this method returns {@code Collections.EMPTY_LIST}, otherwise it returns an {@code ArrayList} which can be
   * further used in Schreier-Sims algorithm.
   * @param knownBase some proposed base points
   * @param generators group generators
   * @param degree degree of group used to create Schreier vectors of proper length
   * @return raw BSGS candidate
   */
  public static List<BaseStrongGeneratingCandidateElement> createRawBSGSCandidate(final int[] knownBase, final List<IntegerPermutation> generators, final int degree) {
    if (degree == 0) {
      return Collections.emptyList();
    }

    // first, lets remove unnecessary base points, i.e. such points, that are fixed by all generators

    final ArrayList<Integer> base = new ArrayList<>(knownBase.length);
    for (final int v : knownBase) {
      base.add(v);
    }

    //we try to find such a point that is not fixed at least by one of the generators
    out:
    for (int i = base.size() - 1; i >= 0; --i) {
      for (final IntegerPermutation permutation : generators) {
        if (permutation.image(base.get(i)) != base.get(i)) {
          continue out;
        }
      }
      base.remove(i);
    }

    if (base.isEmpty()) {
      // there is no any point that is not fixed by all generators, i.e. all generators fixes all points in the specified base
      // all that's left is to try to find a base
      return createRawBSGSCandidate(generators, degree);
    }


    final ArrayList<BaseStrongGeneratingCandidateElement> bsgs = new ArrayList<>(knownBase.length);
    // corresponding G^(i) is G^(0) = G, so its stabilizer generators (stabilizes zero points)
    // are just generators of group
    bsgs.add(new BaseStrongGeneratingCandidateElement(base.get(0), new ArrayList<>(generators), degree));
    for (int i = 1, size = base.size(); i < size; ++i) {
      // lets find generators that fixes all points before current point
      final ArrayList<IntegerPermutation> stabilizerGenerators = new ArrayList<>();
      allgenerators:
      for (final IntegerPermutation stabilizerGenerator : generators) {
        for (int j = 0; j < i; ++j) {
          if (stabilizerGenerator.image(base.get(j)) != base.get(j)) {
            continue allgenerators;
          }
        }
        stabilizerGenerators.add(stabilizerGenerator);
      }
      bsgs.add(new BaseStrongGeneratingCandidateElement(base.get(i), stabilizerGenerators, degree));
    }

    // make use all unused generators
    makeUseOfAllGenerators(bsgs);
    return bsgs;
  }

  /**
   * Creates BSGS using Schreier-Sims algorithm.
   * <p>
   * The underlying code schematically organized as follows:
   * <pre><code>
   * List&lt;BaseStrongGeneratingCandidateElement&gt; BSGSCandidate = createRawBSGSCandidate(generators);
   * if (BSGSCandidate.isEmpty())
   *    return TRIVIAL_BSGS;
   * schreierSimsAlgorithm((ArrayList) BSGSCandidate);
   * return asBSGSList(BSGSCandidate);
   * </code></pre>
   * @param generators a set of group generators
   * @return BSGS represented as array of its element generators are inconsistent (due to antisymmetries)
   */
  public static List<BaseStrongGeneratingElement> createBSGSList(final List<IntegerPermutation> generators) {
    return createBSGSList(generators, IntegerPermutation.degree(generators));
  }

  /**
   * Creates BSGS using Schreier-Sims algorithm.
   * <p>
   * The underlying code schematically organized as follows:
   * <pre><code>
   * List&lt;BaseStrongGeneratingCandidateElement&gt; BSGSCandidate = createRawBSGSCandidate(generators, degree);
   * if (BSGSCandidate.isEmpty())
   *    return TRIVIAL_BSGS;
   * schreierSimsAlgorithm((ArrayList) BSGSCandidate);
   * return asBSGSList(BSGSCandidate);
   * </code></pre>
   * @param generators a set of group generators
   * @param degree degree of group used to create Schreier vectors of proper length
   * @return BSGS represented as array of its element
   */
  public static List<BaseStrongGeneratingElement> createBSGSList(final List<IntegerPermutation> generators, final int degree) {
    final List<BaseStrongGeneratingCandidateElement> bsgsCandidate = createRawBSGSCandidate(generators, degree);
    if (bsgsCandidate.isEmpty()) {
      return TRIVIAL_BSGS;
    }
    schreierSimsAlgorithm(bsgsCandidate);
    removeRedundantBaseRemnant(bsgsCandidate);
    return asBSGSList(bsgsCandidate);
  }

//    /**
//     * Creates BSGS using Schreier-Sims algorithm. Specified base will be extended if necessary.
//     * <p>
//     * The underlying code schematically organized as follows:
//     * <pre><code>
//     * List&lt;BaseStrongGeneratingCandidateElement&gt; BSGSCandidate = createRawBSGSCandidate(knownBase, generators);
//     * if (BSGSCandidate.isEmpty())
//     *    return Collections.EMPTY_LIST;
//     * schreierSimsAlgorithm((ArrayList) BSGSCandidate);
//     * return asBSGSList(BSGSCandidate);
//     * </code></pre>
//     * </p>
//     *
//     * @param generators a set of group generators
//     * @param knownBase  proposed base points
//     * @return BSGS represented as array of its element
//     * @see #createRawBSGSCandidate(int[], java.util.List)
//     * @see #schreierSimsAlgorithm(java.util.ArrayList)
//     */
//    public static List<BaseStrongGeneratingElement> createBSGSList(final int[] knownBase, final List<IntegerPermutation> generators) {
//        return createBSGSList(knownBase, generators, Permutations.degree(generators));
//    }
//
//    /**
//     * Creates BSGS using Schreier-Sims algorithm. Specified base will be extended if necessary.
//     * <p>
//     * The underlying code organized as follows:
//     * <pre><code>
//     * List&lt;BaseStrongGeneratingCandidateElement&gt; BSGSCandidate = createRawBSGSCandidate(knownBase, generators, degree);
//     * if (BSGSCandidate.isEmpty())
//     *    return TRIVIAL_BSGS;
//     * schreierSimsAlgorithm((ArrayList) BSGSCandidate);
//     * return asBSGSList(BSGSCandidate);
//     * </code></pre>
//     * </p>
//     *
//     * @param knownBase  proposed base points
//     * @param generators a set of group generators
//     * @param degree     degree of group used to create Schreier vectors of proper length
//     *                   (see {@link cc.redberry.core.groups.permutations.Permutations#degree(java.util.List)})
//     * @return BSGS represented as array of its element
//     * @see #createRawBSGSCandidate(int[], java.util.List)
//     * @see #schreierSimsAlgorithm(java.util.ArrayList)
//     */
//    public static List<BaseStrongGeneratingElement> createBSGSList(final int[] knownBase, final List<IntegerPermutation> generators, int degree) {
//        List<BaseStrongGeneratingCandidateElement> BSGSCandidate = createRawBSGSCandidate(knownBase, generators, degree);
//        if (BSGSCandidate.isEmpty()) {
//            return TRIVIAL_BSGS;
//        }
//        schreierSimsAlgorithm((ArrayList) BSGSCandidate);
//        removeRedundantBaseRemnant((ArrayList) BSGSCandidate);
//        return asBSGSList(BSGSCandidate);
//    }

  /**
   * If some of generators fixes all base points, then, this method will find a new point that is not fixed by this
   * generator and add this point to specified BSGS candidate.
   * @param bsgsCandidate BSGS candidate
   */
  public static void makeUseOfAllGenerators(final List<BaseStrongGeneratingCandidateElement> bsgsCandidate) {
    // all group generators
    final List<IntegerPermutation> generators = bsgsCandidate.get(0).mStabilizerGenerators;
    final int degree = bsgsCandidate.get(0).internalDegree();
    if (degree == 0) {
      return;
    }
    // iterate over all generators find each one that fixes all base points
    for (final IntegerPermutation generator : generators) {
      boolean fixesBase = true;
      // iterating over all base points
      for (final BaseStrongGeneratingCandidateElement element : bsgsCandidate) {
        if (generator.image(element.mBasePoint) != element.mBasePoint) {
          // this generator does not fix at least one base point => this generator is used
          fixesBase = false;
          break;
        }
      }

      if (fixesBase) {
        // current generator fixes all points in base
        // in order to make it in use let's find any point that is not fixed under current generator
        for (int point = 0; point < degree; ++point) {
          if (generator.image(point) != point) {
            // this point is not fixed by current generator
            // let's add this point to base
            bsgsCandidate.add(new BaseStrongGeneratingCandidateElement(point,
              bsgsCandidate.get(bsgsCandidate.size() - 1).getStabilizersOfThisBasePoint(),
              degree));
          }
        }
      }
    }
  }

  /**
   * Applies Schreier-Sims algorithm to specified BSGS candidate and complete it if necessary; as result, specified
   * BSGS candidate will be guaranteed BSGS. The algorithm described as {@code SCHREIERSIMS} in Sec. 4.4.1 of <b>[Holt05]</b>.
   * @param bsgsCandidate BSGS candidate
   */
  public static void schreierSimsAlgorithm(final List<BaseStrongGeneratingCandidateElement> bsgsCandidate) {
    if (bsgsCandidate.isEmpty()) {
      return;
    }
    final int degree = bsgsCandidate.get(0).internalDegree();
    if (degree == 0) {
      return;
    }
    //main loop
    BaseStrongGeneratingCandidateElement currentElement;
    int index = bsgsCandidate.size() - 1;
    elements:
    while (index >= 0) {
      currentElement = bsgsCandidate.get(index);

      //we need to test that H^i_{beta_i} = H^{(i+1)}
      //for this purpose we shall test that each generator of H^i_{beta_i} belongs to H^{(i+1)}
      //(we already know that H^i_{beta_i} >= H^{(i+1)}, so we shall test that H^i_{beta_i} =< H^{(i+1)})

      // we need to enumerate all generators of H^i_{beta_i}
      // this can be done by enumerating all nontrivial combinations u_{beta}*x*u_{beta^x}^{(-1)},
      // where x - are generators of current group and u_{beta} maps beta_i to beta
      // (see e.g. ORBITSTABILIZER in Sec. 4.1 of [Holt05])
      // enumerating all betas, i.e. current orbit elements
      for (int indexInOrbit = 0, sizeOfOrbit = currentElement.mOrbitList.size();
           indexInOrbit < sizeOfOrbit; ++indexInOrbit) {
        // current point in orbit
        final int beta = currentElement.mOrbitList.get(indexInOrbit);
        // obtain u_{beta} - element that maps beta_i onto beta
        final IntegerPermutation transversalOfBeta = currentElement.getTransversalOf(beta);

        //enumerating through all generators of current element
        for (final IntegerPermutation stabilizer : currentElement.mStabilizerGenerators) {
          // obtain u_{beta^x} - element that maps beta_i onto beta^x
          final IntegerPermutation transversalOfBetaX = currentElement.getTransversalOf(stabilizer.image(beta));

          // so, let's construct nontrivial u_{beta}*x*u_{beta^x}^{(-1)}
          if (!transversalOfBeta.compose(stabilizer).equals(transversalOfBetaX)) {
            // this is a nontrivial generator of H^i_{beta_i}
            final IntegerPermutation schreierGenerator = transversalOfBeta.compose(stabilizer).compose(transversalOfBetaX.inverse());

            // in order to test whether this generator contained in H^(i+1), let's apply STRIP
            // we can use STRIP since main condition H^i_{beta_i} = H^{(i+1)} is already verified for
            // all larger values of index (i.e. if we take a part of BSGS starting from index, then it is
            // real a BSGS for a subgroup fixing all points before index)
            final StripContainer strip = strip(bsgsCandidate, schreierGenerator);

            //this signals, whether we shall add new generator to our BSGS (not necessary a new point)
            boolean toAddNewGenerator = false;
            if (strip.mTerminationLevel < bsgsCandidate.size()) {
              // strip terminated earlier then complete:
              // this means, that corresponding SchreierGenerator extends an orbit of
              // BSGS[mTerminationLevel] element, i.e. there is a permutation (actually it is remainder)
              // that acts on base point of BSGS[mTerminationLevel] and maps it out of its orbit.
              // =>so we shall add a new generator at mTerminationLevel and recalculate its orbit
              toAddNewGenerator = true;
            } else if (!strip.mRemainder.isIdentity()) {
              // in this case, nontrivial remainder fixes all base points
              toAddNewGenerator = true;
              // so, we need also to extend our base with a new point

              // let's find some point that is not fixed by mRemainder
              for (int i = 0; i < degree; ++i) {
                if (strip.mRemainder.image(i) != i) {
                  // adding this point to BSGS (with empty stabilizers set, since it is a last point)
                  bsgsCandidate.add(new BaseStrongGeneratingCandidateElement(i, new ArrayList<>(), degree));
                  // here we can proceed, but we break
                  break;
                }
              }
            }

            if (toAddNewGenerator) {
              // we need to add a new generator
              // (note, that it can fix all old base points, but not necessary)

              for (int i = index + 1; i <= strip.mTerminationLevel; ++i) {
                //add new generator and recalculate orbit and Schreier vector
                bsgsCandidate.get(i).addStabilizer(strip.mRemainder);
              }

              //revert
              index = strip.mTerminationLevel;
              continue elements;
            }
          }
        }
      }
      --index;
    }
  }


//    /**
//     * Applies randomized version of Schreier-Sims algorithm to specified BSGS candidate and complete it if necessary.
//     * The probability that after applying this algorithm the BSGS candidate will be guaranteed BSGS is equal to
//     * specified confidence level. The algorithm described as {@code RANDOMSCHREIER} in Sec. 4.4.5 of <b>[Holt05]</b>.
//     *
//     * @param BSGSCandidate   BSGS candidate
//     * @param confidenceLevel confidence level (0 &lt; confidence level &lt; 1)
//     * @param randomGenerator random generator
//     */
//    public static void RandomSchreierSimsAlgorithm(ArrayList<BaseStrongGeneratingCandidateElement> BSGSCandidate,
//                                                   double confidenceLevel, RandomGenerator randomGenerator) {
//        if (confidenceLevel > 1 || confidenceLevel < 0) {
//            throw new IllegalArgumentException("Confidence level must be between 0 and 1.");
//        }
//        if (BSGSCandidate.isEmpty()) {
//            return;
//        }
//        final int degree = BSGSCandidate.get(0).degree();
//        if (degree == 0) {
//            return;
//        }
//        //source of randomness
//        List<IntegerPermutation> source = new ArrayList<>(BSGSCandidate.get(0).mStabilizerGenerators);
//        randomness(source, DEFAULT_RANDOMNESS_EXTEND_TO_SIZE, DEFAULT_NUMBER_OF_RANDOM_REFINEMENTS, randomGenerator);
//        //recalculate BSGSCandidate
//        //for (BaseStrongGeneratingCandidateElement element : BSGSCandidate)
//        //    element.recalculateOrbitAndSchreierVector();
//        makeUseOfAllGenerators(BSGSCandidate);
//
//        //counts the random elements sifted without change to BSGS
//        int sifted = 0;
//        int CL = (int) (-FastMath.log(2, 1 - confidenceLevel));
//        assert CL > 0;
//
//        //main loop
//        IntegerPermutation randomElement;
//        elements:
//        while (sifted < CL) {
//            //random element
//            randomElement = random(source, randomGenerator);
//
//            //let's try to represent it via our BSGS candidate
//            StripContainer strip = strip(BSGSCandidate, randomElement);
//
//            //this signals, whether we shall add new generator to our BSGS (not necessary a new point)
//            boolean toAddNewGenerator = false;
//            if (strip.mTerminationLevel < BSGSCandidate.size()) {
//                // strip terminated earlier then complete:
//                // this means, that corresponding randomElement extends an orbit of
//                // BSGS[mTerminationLevel] element, i.e. there is a permutation (actually it is remainder)
//                // that acts on base point of BSGS[mTerminationLevel] and maps it out of its orbit.
//                // =>so we shall add a new generator at mTerminationLevel and recalculate its orbit
//                toAddNewGenerator = true;
//            } else if (!strip.mRemainder.isIdentity()) {
//                //in this case, nontrivial mRemainder fixes all base points
//                toAddNewGenerator = true;
//                //so, we need also to extend our base with a new point
//
//                //let's find some point that is not fixed by mRemainder
//                for (int i = 0; i < degree; ++i) {
//                    if (strip.mRemainder.newIndexOf(i) != i) {
//                        // adding this point to BSGS (with empty stabilizers set, since it is a last point)
//                        BSGSCandidate.add(new BaseStrongGeneratingCandidateElement(i, new ArrayList<IntegerPermutation>(), degree));
//                        //here we can proceed, but we break
//                        break;
//                    }
//                }
//            }
//
//            if (toAddNewGenerator) {
//                // we need to add a new generator
//                // (note, that it can fix all old base points, but not necessary)
//
//                //we do not know the index, so we shall add it to all elements (c'est la vie)
//                for (int i = 1; i <= strip.mTerminationLevel; ++i) {
//                    //add new generator and recalculate orbit and Schreier vector
//                    BSGSCandidate.get(i).addStabilizer(strip.mRemainder);
//                }
//
//                //revert
//                sifted = 0;
//            } else {
//                //our random element is already in BSGS
//                //this increases the probability that our candidate is a real BSGS!
//                ++sifted;
//            }
//        }
//    }
//
//    /**
//     * Applies randomized version of Schreier-Sims algorithm to specified BSGS until the group order calculated
//     * using this candidate is not equals to order specified; as result, specified BSGS candidate will be guarantied
//     * BSGS. If specified order greater then the order of permutation group generated by specified BSGS candidate,
//     * then the algorithm will fall in infinite loop.
//     *
//     * @param BSGSCandidate   BSGS candidate
//     * @param groupOrder      order of a group
//     * @param randomGenerator random generator
//     */
//    public static void RandomSchreierSimsAlgorithmForKnownOrder(ArrayList<BaseStrongGeneratingCandidateElement> BSGSCandidate,
//                                                                Z groupOrder, RandomGenerator randomGenerator) {
//        if (BSGSCandidate.isEmpty()) {
//            return;
//        }
//        final int degree = BSGSCandidate.get(0).degree();
//        if (degree == 0) {
//            return;
//        }
//
//        //source of randomness
//        List<IntegerPermutation> source = new ArrayList<>(BSGSCandidate.get(0).mStabilizerGenerators);
//        randomness(source, DEFAULT_RANDOMNESS_EXTEND_TO_SIZE, DEFAULT_NUMBER_OF_RANDOM_REFINEMENTS, randomGenerator);
//        //recalculate BSGSCandidate
//        //for (BaseStrongGeneratingCandidateElement element : BSGSCandidate)
//        //    element.recalculateOrbitAndSchreierVector();
//        //makeUseOfAllGenerators(BSGSCandidate, degree);
//
//        //main loop
//        IntegerPermutation randomElement;
//        elements:
//        while (!groupOrder.equals(calculateOrder(BSGSCandidate))) {
//            //random element
//            randomElement = random(source, randomGenerator);
//
//            //let's try to represent it via our BSGS candidate
//            StripContainer strip = strip(BSGSCandidate, randomElement);
//
//            //this signals, whether we shall add new generator to our BSGS (not necessary a new point)
//            boolean toAddNewGenerator = false;
//            if (strip.mTerminationLevel < BSGSCandidate.size()) {
//                // strip terminated earlier then complete:
//                // this means, that corresponding randomElement extends an orbit of
//                // BSGS[mTerminationLevel] element, i.e. there is a permutation (actually it is remainder)
//                // that acts on base point of BSGS[mTerminationLevel] and maps it out of its orbit.
//                // =>so we shall add a new generator at mTerminationLevel and recalculate its orbit
//                toAddNewGenerator = true;
//            } else if (!strip.mRemainder.isIdentity()) {
//                //in this case, nontrivial mRemainder fixes all base points
//                toAddNewGenerator = true;
//                //so, we need also to extend our base with a new point
//
//                //let's find some point that is not fixed by mRemainder
//                for (int i = 0; i < degree; ++i) {
//                    if (strip.mRemainder.newIndexOf(i) != i) {
//                        // adding this point to BSGS (with empty stabilizers set, since it is a last point)
//                        BSGSCandidate.add(new BaseStrongGeneratingCandidateElement(i, new ArrayList<IntegerPermutation>(), degree));
//                        //here we can proceed, but we break
//                        break;
//                    }
//                }
//            }
//
//            if (toAddNewGenerator) {
//                // we need to add a new generator
//                // (note, that it can fix all old base points, but not necessary)
//
//                //we do not know the index, so we shall add it to all elements (c'est la vie)
//                for (int i = 1; i <= strip.mTerminationLevel; ++i) {
//                    //add new generator and recalculate orbit and Schreier vector
//                    BSGSCandidate.get(i).addStabilizer(strip.mRemainder);
//                }
//            }
//        }
//    }
//

  /**
   * Calculates order of permutation group represented by specified BSGS.
   * @param bsgsList BSGS
   * @return order of permutation group represented by specified BSGS
   */
  public static Z calculateOrder(final List<? extends BaseStrongGeneratingElement> bsgsList) {
    return calculateOrder(bsgsList, 0);
  }

  static Z calculateOrder(final List<? extends BaseStrongGeneratingElement> bsgsList, final int from) {
    Z order = Z.ONE;
    final int size = bsgsList.size();
    for (int i = from; i < size; ++i) {
      order = order.multiply(Z.valueOf(bsgsList.get(i).orbitSize()));
    }
    return order;
  }

//
//    /**
//     * Removes redundant elements from BSGS candidate. The algorithm have O(degree^5) complexity in the worst case.
//     *
//     * @param BSGSCandidate BSGS candidate
//     */
//    public static void removeRedundantGenerators(ArrayList<BaseStrongGeneratingCandidateElement> BSGSCandidate) {
//        if (BSGSCandidate.size() <= 1) {
//            return;
//        }
//
//        /* REMOVEGENS in Sec. 4.4.4 in [Holt05] IS WRONG!!! */
//
//        int degree = BSGSCandidate.get(0).degree();
//        if (degree == 0) {
//            return;
//        }
//        //the following is correct
//        for (int i = BSGSCandidate.size() - 2; i > 0; --i) {
//            BaseStrongGeneratingCandidateElement element = BSGSCandidate.get(i);
//            //iterator over stabilizer generators
//            ListIterator<IntegerPermutation> iterator = element.mStabilizerGenerators.listIterator();
//            //temp list of stabilizer with removed redundant elements
//            ArrayList<IntegerPermutation> tempStabilizers = null;
//            boolean removed = false;
//            //current stabilizer element
//            IntegerPermutation current;
//            out:
//            while (iterator.hasNext()) {
//                current = iterator.next();
//                if (current.isIdentity()) {
//                    iterator.remove();
//                    removed = true;
//                    continue;
//                }
//                // if current belongs to next stabilizers, i.e. it fixes beta_i & belongs to next BSGS element,
//                // then it cannot be removed; note that second condition is necessary,
//                // while first is redundant (but rids from obviously unnecessary checks)!
//                if (current.newIndexOf(element.mBasePoint) == element.mBasePoint
//                        && BSGSCandidate.get(i + 1).mStabilizerGenerators.contains(element)) {
//                    continue;
//                }
//                //<-so generator does not fix base point and do not belongs to next element
//                //let's check whether it is redundant
//                if (tempStabilizers == null) {
//                    //make a copy of current stabilizers
//                    tempStabilizers = new ArrayList<>(element.mStabilizerGenerators);
//                }
//                tempStabilizers.remove(current);
//
//                //if new stabilizers generate same group => then current generator is redundant
//                if (Permutations.getOrbitSize(tempStabilizers, element.mBasePoint, degree) == element.orbitSize()) {
//                    //<!!! we must ensure that next stabilizer in chain is a subgroup of temp !!! >//
//                    int[] subBase = getBaseAsArray(BSGSCandidate, i);
//                    List<BaseStrongGeneratingCandidateElement> _subBSGS = createRawBSGSCandidate(subBase, tempStabilizers, degree);
//                    if (_subBSGS.isEmpty()) {
//                        assert calculateOrder(BSGSCandidate, i).intValue() != 1;
//                        continue;
//                    }
//                    ArrayList<BaseStrongGeneratingCandidateElement> subBSGS = (ArrayList) _subBSGS;
//                    schreierSimsAlgorithm(subBSGS);
//                    if (!calculateOrder(BSGSCandidate, i).equals(calculateOrder(subBSGS))) {
//                        continue out;
//                    }
//                    for (IntegerPermutation stabGen : BSGSCandidate.get(i + 1).mStabilizerGenerators) {
//                        if (!membershipTest(subBSGS, stabGen)) {
//                            continue out;
//                        }
//                    }
//
//                    iterator.remove();
//                    removed = true;
//                } else {
//                    //if not, we need revert
//                    tempStabilizers.add(current);
//                }
//            }
//            //if something was removed, then we need to recalculate Schreier vector
//            if (removed) {
//                element.recalculateOrbitAndSchreierVector();
//            }
//        }
//    }

  /**
   * Removes redundant base points from the ending of specified BSGS.
   * @param bsgs BSGS
   */
  public static void removeRedundantBaseRemnant(final List<BaseStrongGeneratingCandidateElement> bsgs) {
    for (int i = bsgs.size() - 1; i >= 0; --i) {
      if (bsgs.get(i).mStabilizerGenerators.isEmpty()) {
        bsgs.remove(i);
      } else { //we can break since this guarantees that all other points are not redundant
        break;
      }
    }
  }

//    /**
//     * Returns true if specified BSGS candidate is a real BSGS. Method uses a restricted version of Schreier-Sims
//     * algorithm.
//     *
//     * @param BSGSCandidate BSGS candidate
//     * @return true if specified BSGS candidate is a real BSGS and false otherwise
//     */
//    public static boolean isBSGS(List<? extends BaseStrongGeneratingElement> BSGSCandidate) {
//        if (BSGSCandidate.isEmpty()) {
//            return true;
//        }
//        //main loop
//        BaseStrongGeneratingElement currentElement;
//        int index = BSGSCandidate.size() - 1;
//        while (index >= 0) {
//            currentElement = BSGSCandidate.get(index);
//            //testing that H^i_{beta_i} = H^{(i+1)}
//
//
//            // enumerating all generators of H^i_{beta_i} (see ORBITSTABILIZER)
//            //    enumerating all betas, i.e. current orbit elements
//            for (int indexInOrbit = 0, sizeOfOrbit = currentElement.mOrbitList.size();
//                 indexInOrbit < sizeOfOrbit; ++indexInOrbit) {
//                //current point in orbit
//                int beta = currentElement.mOrbitList.get(indexInOrbit);
//                //obtain u_{beta} - element that maps beta_i onto beta
//                IntegerPermutation transversalOfBeta = currentElement.getTransversalOf(beta);
//
//                //enumerating through all generators of current element
//                for (IntegerPermutation stabilizer : currentElement.mStabilizerGenerators) {
//                    //obtain u_{beta^x} - element that maps beta_i onto beta^x
//                    IntegerPermutation transversalOfBetaX =
//                            currentElement.getTransversalOf(stabilizer.newIndexOf(beta));
//
//                    //so, let's construct nontrivial u_{beta}*x*u_{beta^x}^{(-1)}
//                    if (!transversalOfBeta.composition(stabilizer).equals(transversalOfBetaX)) {
//                        //this is a nontrivial generator of H^i_{beta_i}
//                        IntegerPermutation SchreierGenerator = transversalOfBeta.composition(stabilizer, transversalOfBetaX.inverse());
//                        // in order to test whether this generator contained in H^(i+1), let's apply STRIP
//                        StripContainer strip = strip(BSGSCandidate, SchreierGenerator);
//                        //if STRIP gives a nontrivial result, then this is not a BSGS
//                        if (strip.mTerminationLevel < BSGSCandidate.size() || !strip.mRemainder.isIdentity()) {
//                            return false;
//                        }
//                    }
//                }
//            }
//            --index;
//        }
//        return true;
//    }
//
//    /**
//     * Returns true if specified BSGS candidate is a real BSGS with specified confidence level. Method uses a restricted
//     * version of randomized Schreier-Sims algorithm.
//     *
//     * @param BSGSCandidate   BSGS candidate
//     * @param confidenceLevel confidence level (0 &lt; confidence level &lt; 1)
//     * @param randomGenerator random generator
//     * @return true if specified BSGS candidate is a real BSGS and false otherwise
//     */
//    public static boolean isBSGS(List<? extends BaseStrongGeneratingElement> BSGSCandidate, double confidenceLevel,
//                                 RandomGenerator randomGenerator) {
//        if (confidenceLevel > 1 || confidenceLevel < 0) {
//            throw new IllegalArgumentException("Confidence level must be between 0 and 1.");
//        }
//
//        //source of randomness
//        List<IntegerPermutation> source = new ArrayList<>(BSGSCandidate.get(0).mStabilizerGenerators);
//        randomness(source, DEFAULT_RANDOMNESS_EXTEND_TO_SIZE, DEFAULT_NUMBER_OF_RANDOM_REFINEMENTS, randomGenerator);
//        source = new ArrayList<>(source);
//
//        //counts the random elements sifted without change to BSGS
//        int sifted = 0;
//        int CL = (int) (-FastMath.log(2, 1 - confidenceLevel));
//        assert CL > 0;
//
//        //main loop
//        IntegerPermutation randomElement;
//        elements:
//        while (sifted < CL) {
//            //random element
//            randomElement = random(source, randomGenerator);
//
//            //let's try to represent it via our BSGS candidate
//            StripContainer strip = strip(BSGSCandidate, randomElement);
//
//            //this signals, whether we shall add new generator to our BSGS (not necessary a new point)
//            boolean toAddNewGenerator = false;
//            if (strip.mTerminationLevel < BSGSCandidate.size() || !strip.mRemainder.isIdentity()) {
//                return false;
//            }
//            //our random element is already in BSGS
//            //this increases the probability that our candidate is a real BSGS!
//            ++sifted;
//
//        }
//        return true;
//    }
//
//    /**
//     * Returns the number of elements in specified strong generating set.
//     *
//     * @param BSGS strong generating set
//     * @return number of elements in specified strong generating set
//     */
//    public static long numberOfStrongGenerators(List<? extends BaseStrongGeneratingElement> BSGS) {
//        /* Since expected maximum number of generators
//           in BSGS is about n*(n-1)/2, then, in order to avoid integer overflow, we use long, since for
//           n ~ Integer.MAX_VALUE the corresponding number of elements an be up to ~ Long.MAX_VALUE / 2. */
//        long num = 0;
//        for (BaseStrongGeneratingElement el : BSGS) {
//            num += el.mStabilizerGenerators.size();
//        }
//        return num;
//    }
//
//    /**
//     * Swaps <i>i-th</i> and <i>(i+1)-th</i> points of specified BSGS. The details of the implementation can be
//     * found in Sec. 4.4.7 of <b>[Holt05]</b> (see {@code BASESWAP} algorithm).
//     *
//     * @param BSGS BSGS
//     * @param i    position of base point to swap with next point
//     */
//    public static void swapAdjacentBasePoints(final ArrayList<BaseStrongGeneratingCandidateElement> BSGS, int i) {
//        if (i > BSGS.size() - 2) {
//            throw new IndexOutOfBoundsException();
//        }
//
//        ArrayList<IntegerPermutation> newStabilizers;
//
//        //i-th and (i+1)-th base points
//        int ithBeta = BSGS.get(i).mBasePoint, jthBeta = BSGS.get(i + 1).mBasePoint;
//        //"effective" degree can be greater
//        final int effectiveDegree = Math.max(BSGS.get(0).degree(), Math.max(ithBeta + 1, jthBeta + 1));
//
//        //computing size of orbit of beta_{i+1} under G^(i)
//        int d = Permutations.getOrbitSize(BSGS.get(i).mStabilizerGenerators, BSGS.get(i + 1).mBasePoint, effectiveDegree);
//        //as we know |H| = s |G^(i+2)|, where s
//        int s = (int) ((((long) BSGS.get(i).orbitSize()) * BSGS.get(i + 1).orbitSize()) / ((long) d));//avoid integer overflow
//
//        //new stabilizers of G^(i+1)'
//        //these stabilizers should fix beta_1, beta_2, ..., beta_(i-1), beta_(i+1)
//        if (i == BSGS.size() - 2) {
//            newStabilizers = new ArrayList<>();
//        } else {
//            newStabilizers = new ArrayList<>(BSGS.get(i + 2).mStabilizerGenerators);
//        }
//
//
//        //allowed points
//        BitArray allowedPoints = new BitArray(effectiveDegree);
//        allowedPoints.setAll(BSGS.get(i).mOrbitList, true);
//        allowedPoints.set(ithBeta, false);
//        allowedPoints.set(jthBeta, false);
//
//        //we shall store the orbit of ithBeta under new stabilizers in BaseStrongGeneratingCandidateElement
//        BaseStrongGeneratingCandidateElement newOrbitStabilizer =
//                new BaseStrongGeneratingCandidateElement(ithBeta, newStabilizers, effectiveDegree);
//
//        //main loop
//        main:
//        while (newOrbitStabilizer.orbitSize() != s) {
//            //this loop is redundant but helps to avoid unnecessary calculations of orbits in the main loop condition
//            int nextBasePoint = -1;
//            while ((nextBasePoint = allowedPoints.nextBit(++nextBasePoint)) != -1) {
//                //transversal
//                IntegerPermutation transversal = BSGS.get(i).getTransversalOf(nextBasePoint);
//                int newIndexUnderInverse = transversal.newIndexOfUnderInverse(jthBeta);
//                //check whether beta_{i+1}^(inverse transversal) belongs to orbit of G^{i+1}
//                if (!BSGS.get(i + 1).belongsToOrbit(newIndexUnderInverse)) {
//                    //then this transversal is bad and we can skip the orbit of this point under new stabilizers
//                    ArrayList<Integer> toRemove = Permutations.getOrbitList(
//                            newOrbitStabilizer.mStabilizerGenerators, nextBasePoint, effectiveDegree);
//                    allowedPoints.setAll(toRemove, false);
//                } else {
//                    //<-ok this transversal is good
//                    //we need an element in G^(4) that beta_{i+1}^element = beta_{i+1}^{inverse transversal}
//                    //so that beta_{i+1} is fixed under product of element * transversal
//                    //todo unnecessary composition can be carried out!
//                    IntegerPermutation newStabilizer =
//                            BSGS.get(i + 1).getTransversalOf(newIndexUnderInverse).composition(transversal);
//                    //if this element was not yet seen
//                    if (!newOrbitStabilizer.belongsToOrbit(newStabilizer.newIndexOf(ithBeta))) {
//                        newOrbitStabilizer.addStabilizer(newStabilizer);
//                        ArrayList<Integer> toRemove = Permutations.getOrbitList(
//                                newOrbitStabilizer.mStabilizerGenerators, nextBasePoint, effectiveDegree);
//                        allowedPoints.setAll(toRemove, false);
//                        continue main;
//                    }
//                }
//            }
//        }
//
//        //swap base points (orbits and and Schreier vectors will be recalculated in constructors)
//        BaseStrongGeneratingCandidateElement ith = new BaseStrongGeneratingCandidateElement(BSGS.get(i + 1).mBasePoint, BSGS.get(i).mStabilizerGenerators, effectiveDegree);
//        BaseStrongGeneratingCandidateElement jth = new BaseStrongGeneratingCandidateElement(BSGS.get(i).mBasePoint, newStabilizers, effectiveDegree);
//        BSGS.set(i, ith);
//        BSGS.set(i + 1, jth);
//    }
//
//    /**
//     * Changes <i>i-th</i> base point with a new value, by insertion redundant point and swapping.
//     *
//     * @param BSGS                 BSGS
//     * @param oldBasePointPosition position of base point to change
//     * @param newBasePoint         new base point
//     */
//    static void changeBasePointWithTranspositions(ArrayList<BaseStrongGeneratingCandidateElement> BSGS,
//                                                  int oldBasePointPosition, int newBasePoint) {
//        assert BSGS.get(oldBasePointPosition).mBasePoint != newBasePoint;
//
//        //let's check whether this point is already presented in BSGS
//        for (int index = oldBasePointPosition + 1; index < BSGS.size(); ++index) {
//            if (BSGS.get(index).mBasePoint == newBasePoint) {
//                //<- newBasePoint is already in BSGS => just swap
//                while (index > oldBasePointPosition) {
//                    swapAdjacentBasePoints(BSGS, --index);
//                }
//                return;
//            }
//        }
//
//
//        int insertionPosition = oldBasePointPosition + 1;
//        insertion_points:
//        for (; insertionPosition < BSGS.size(); ++insertionPosition) {
//            for (IntegerPermutation permutation : BSGS.get(insertionPosition).mStabilizerGenerators) {
//                if (permutation.newIndexOf(newBasePoint) != newBasePoint) {
//                    continue insertion_points;
//                }
//            }
//            break;
//        }
//
//        final int degree = BSGS.get(0).degree();
//        if (insertionPosition == BSGS.size()) {
//            //<- no element that fixes new base point
//            BSGS.add(new BaseStrongGeneratingCandidateElement(newBasePoint, new ArrayList<IntegerPermutation>(), degree));
//        } else if (BSGS.get(insertionPosition).mBasePoint != newBasePoint) {
//            //<- we've found an element (call it pivot) that stabilizes all
//            // points before pivot and also a new base point
//            // we can insert a new base point before pivot, and still pivot will fix all points before pivot
//
//            //stabilizers of new base point inserted are same to stabilizers of pivot
//            BSGS.add(insertionPosition,
//                    new BaseStrongGeneratingCandidateElement(newBasePoint,
//                            new ArrayList<>(BSGS.get(insertionPosition).mStabilizerGenerators), degree));
//        }
//        //then just swap
//        //note, that if insertionPosition <= i then no any swap needed
//        while (insertionPosition > oldBasePointPosition) {
//            swapAdjacentBasePoints(BSGS, --insertionPosition);
//        }
//    }
//
//    /**
//     * Changes the base of specified BSGS to specified new base using an algorithm with transpositions. The
//     * algorithm guaranties that if initial base is [b1, b2, b3, ..., bk] and specified base is [a1, a2, a3, ..., al],
//     * then the resulting base will look like  [a1, a2, a3, ...., al, b4, b7, ..., b19] with no any redundant base
//     * points at the end (redundant point is point which corresponding stabilizer generators are empty) - this
//     * achieves by invocation of {@link #removeRedundantBaseRemnant(java.util.ArrayList)} at the end of procedure.
//     *
//     * @param BSGS    BSGS
//     * @param newBase new base
//     */
//    public static void rebaseWithTranspositions(ArrayList<BaseStrongGeneratingCandidateElement> BSGS, int[] newBase) {
//        for (int i = 0; i < newBase.length && i < BSGS.size(); ++i) {
//            int newBasePoint = newBase[i];
//            if (BSGS.get(i).mBasePoint != newBasePoint) {
//                changeBasePointWithTranspositions(BSGS, i, newBasePoint);
//            }
//        }
//        removeRedundantBaseRemnant(BSGS);
//    }
//
//    /**
//     * Changes base of specified BSGS to specified new base using an algorithm with conjugations and transpositions.
//     * The algorithm guaranties that if initial base is [b1, b2, b3, ..., bk] and specified base is [a1, a2, a3, ..., al],
//     * then the resulting base will look like  [a1, a2, a3, ...., al, b4, b7, ..., b19] with no any redundant base
//     * points at the end (redundant point is point which corresponding stabilizer generators are empty) - this
//     * achieves by invocation of {@link #removeRedundantBaseRemnant(java.util.ArrayList)} at the end of procedure.
//     *
//     * @param BSGS    BSGS
//     * @param newBase new base
//     */
//    public static void rebaseWithConjugationAndTranspositions(ArrayList<BaseStrongGeneratingCandidateElement> BSGS, int[] newBase) {
//        //conjugating permutation
//        IntegerPermutation conjugation = Permutations.getIdentityIntegerPermutation();
//
//        final int degree = BSGS.get(0).degree();
//        int positionOfFirstChanged = -1;
//        //first, lets proceed by swapping
//        for (int i = 0; i < newBase.length && i < BSGS.size(); ++i) {
//            //new base point image under conjugation
//            int newBasePoint = conjugation.newIndexOfUnderInverse(newBase[i]);
//            //early check
//            if (BSGS.get(i).mBasePoint == newBasePoint) {
//                continue;
//            }
//
//            if (positionOfFirstChanged == -1) {
//                positionOfFirstChanged = i;
//            }
//
//            //check, whether new base point belongs to current orbit, i.e. there is some permutation in G
//            //that maps current point onto new point
//            if (BSGS.get(i).belongsToOrbit(newBasePoint)) {
//                //we can simply conjugate this base element
//                IntegerPermutation transversal = BSGS.get(i).getTransversalOf(newBasePoint);
//                conjugation = transversal.composition(conjugation);
//                continue;
//            }
//
//            //<- else, if new base point does not belong to current orbit we'll proceed as usual
//            changeBasePointWithTranspositions(BSGS, i, newBasePoint);
//        }
//
//        //removing redundant now for performance
//        removeRedundantBaseRemnant(BSGS);
//        if (BSGS.size() <= positionOfFirstChanged) {
//            return;
//        }
//
//        //conjugating base and strong generating set
//        if (!conjugation.isIdentity()) {
//            //inverse conjugation
//            IntegerPermutation inverse = conjugation.inverse();
//            ListIterator<BaseStrongGeneratingCandidateElement> elementsIterator = BSGS.listIterator(positionOfFirstChanged);
//            while (elementsIterator.hasNext()) {
//                BaseStrongGeneratingCandidateElement element = elementsIterator.next();
//                //conjugating stabilizers
//                ArrayList<IntegerPermutation> newStabilizers = new ArrayList<>(element.mStabilizerGenerators.size());
//                for (IntegerPermutation oldStabilizer : element.mStabilizerGenerators) {
//                    newStabilizers.add(inverse.composition(oldStabilizer, conjugation));
//                }
//
//                //conjugating base point
//                int newBasePoint = conjugation.newIndexOf(element.mBasePoint);
//                elementsIterator.set(
//                        new BaseStrongGeneratingCandidateElement(newBasePoint, newStabilizers, degree));
//            }
//        }
//        removeRedundantBaseRemnant(BSGS);
//    }
//
//    /**
//     * Changes base of specified BSGS to specified new base by construction of a new BSGS with known base using
//     * randomized Schreier-Sims algorithm {@link #RandomSchreierSimsAlgorithmForKnownOrder(java.util.ArrayList, java.math.Z, org.apache.commons.math3.random.RandomGenerator)}.
//     * The algorithm guaranties that if initial base is [b1, b2, b3, ..., bk] and specified base is [a1, a2, a3, ..., al],
//     * then the resulting base will look like  [a1, a2, a3, ...., al, x, y, ..., z] with no any redundant base
//     * points at the end (redundant point is point which corresponding stabilizer generators are empty) but with some
//     * additional points introduced if specified new base was not a nought.
//     *
//     * @param BSGS    BSGS
//     * @param newBase new base
//     */
//    public static void rebaseFromScratch(ArrayList<BaseStrongGeneratingCandidateElement> BSGS, int[] newBase) {
//        List<BaseStrongGeneratingCandidateElement> newBSGS = createRawBSGSCandidate(newBase, BSGS.get(0).mStabilizerGenerators,
//                BSGS.get(0).degree());
//        if (newBSGS.isEmpty())//todo add new base points here!!!!
//        {
//            return; //new base is fixed by all group generators; nothing to do
//        }
//        Z order = calculateOrder(BSGS);
//        RandomSchreierSimsAlgorithmForKnownOrder((ArrayList) newBSGS, order, CC.getRandomGenerator());
//        int i = 0;
//        for (; i < newBSGS.size() && i < BSGS.size(); ++i) {
//            BSGS.set(i, newBSGS.get(i));
//        }
//        if (i < newBSGS.size()) {
//            for (; i < newBSGS.size(); ++i) {
//                BSGS.add(newBSGS.get(i));
//            }
//        }
//        if (i < BSGS.size()) {
//            for (int j = BSGS.size() - 1; j >= i; --j) {
//                BSGS.remove(j);
//            }
//        }
//    }
//
//
//    /**
//     * Changes base of specified BSGS to the specified base. The algorithm heuristically choose the algorithm of base
//     * change.
//     *
//     * @param BSGS    BSGS
//     * @param newBase new base
//     * @see #rebaseWithTranspositions(java.util.ArrayList, int[])
//     * @see #rebaseWithConjugationAndTranspositions(java.util.ArrayList, int[])
//     * @see #rebaseFromScratch(java.util.ArrayList, int[])
//     */
//    public static void rebase(ArrayList<BaseStrongGeneratingCandidateElement> BSGS, int[] newBase) {
//        rebaseWithConjugationAndTranspositions(BSGS, newBase);
//    }
//
//
//    //------------------------------ FACTORIES --------------------------------------------//
//
//
//    /**
//     * Returns direct product of two groups given by their BSGS. This product is organized as follows:
//     * the initial segment of each permutation is equal to permutation taken from first group, while the rest is taken
//     * from the second.
//     *
//     * @param bsgs1 BSGS of first group
//     * @param bsgs2 BSGS of second group
//     * @return direct product first group and second group
//     */
//    public static ArrayList<BaseStrongGeneratingElement> directProduct(List<? extends BaseStrongGeneratingElement> bsgs1, List<? extends BaseStrongGeneratingElement> bsgs2) {
//        int degree1 = bsgs1.get(0).degree(), degree2 = bsgs2.get(0).degree();
//        int deg = degree1 + degree2;
//
//        //adjust bsgs of group
//        ArrayList<BaseStrongGeneratingElement> groupBsgsExtended = new ArrayList<>(bsgs2.size());
//        for (BaseStrongGeneratingElement element : bsgs2) {
//            ArrayList<IntegerPermutation> stabilizers = new ArrayList<>(element.mStabilizerGenerators.size());
//            for (IntegerPermutation p : element.mStabilizerGenerators) {
//                stabilizers.add(p.moveRight(degree1));
//            }
//
//            int[] mSchreierArray = new int[deg];
//            Arrays.fill(mSchreierArray, 0, degree1, -2);
//            System.arraycopy(element.mSchreierArray.mData, 0, mSchreierArray, degree1, degree2);
//            ArrayList<Integer> orbit = new ArrayList<Integer>(element.mOrbitList.size());
//            for (int i = element.mOrbitList.size() - 1; i >= 0; --i) {
//                orbit.add(element.mOrbitList.get(i) + degree1);
//            }
//            groupBsgsExtended.add(new BaseStrongGeneratingElement(element.mBasePoint + degree1, stabilizers,
//                    new mSchreierArray(mSchreierArray), orbit));
//        }
//
//        ArrayList<BaseStrongGeneratingElement> bsgs = new ArrayList<>(bsgs1.size() + bsgs2.size());
//        //adjust bsgs of this
//        for (BaseStrongGeneratingElement element : bsgs1) {
//            ArrayList<IntegerPermutation> stabilizers = new ArrayList<>(element.mStabilizerGenerators.size());
//            for (IntegerPermutation p : element.mStabilizerGenerators) {
//                stabilizers.add(p);
//            }
//            stabilizers.addAll(groupBsgsExtended.get(0).mStabilizerGenerators);
//            int[] mSchreierArray = new int[deg];
//            System.arraycopy(element.mSchreierArray.mData, 0, mSchreierArray, 0, degree1);
//            Arrays.fill(mSchreierArray, degree1, deg, -2);
//            bsgs.add(new BaseStrongGeneratingElement(element.mBasePoint, stabilizers,
//                    new mSchreierArray(mSchreierArray), element.mOrbitList));
//        }
//        bsgs.addAll(groupBsgsExtended);
//
//        return bsgs;
//    }
//
//    /**
//     * Calculates a union of specified groups.
//     *
//     * @param bsgs1 base and strong generating set of first group
//     * @param bsgs2 base and strong generating set of second group
//     * @return base and strong generating set of the union
//     */
//    public static ArrayList<? extends BaseStrongGeneratingElement> union(ArrayList<? extends BaseStrongGeneratingElement> bsgs1,
//                                                         ArrayList<? extends BaseStrongGeneratingElement> bsgs2) {
//        if (bsgs2.isEmpty()) {
//            return bsgs1;
//        }
//        if (bsgs1.isEmpty()) {
//            return bsgs2;
//        }
//
//        int[] base1 = getBaseAsArray(bsgs1),
//                base2 = getBaseAsArray(bsgs2);
//        int[] base = MathUtils.intSetUnion(base1, base2);
//        ArrayList<IntegerPermutation> generators = new ArrayList<>();
//        generators.addAll(bsgs1.get(0).mStabilizerGenerators);
//        generators.addAll(bsgs1.get(0).mStabilizerGenerators);
//
//        int degree = Math.max(ArraysUtils.max(base) + 1, Permutations.degree(generators));
//        ArrayList<BaseStrongGeneratingCandidateElement> bsgs = (ArrayList) createRawBSGSCandidate(base, generators, degree);
//        schreierSimsAlgorithm(bsgs);
//        return bsgs;
//    }

  private static final List<BaseStrongGeneratingElement> TRIVIAL_BSGS;

  static {
    TRIVIAL_BSGS = new ArrayList<>(1);
    final ArrayList<IntegerPermutation> gens = new ArrayList<>();
    gens.add(IntegerPermutation.identity(1)); // todo this probably needs a size!
    TRIVIAL_BSGS.add(new BaseStrongGeneratingCandidateElement(0, gens, 1).asBaseStrongGeneratingElement());
  }

//    /**
//     * This value is an upper bound of degrees, which we consider as "small".
//     */
//    public static final int SMALL_DEGREE_THRESHOLD = 100;
//    /**
//     * Cached BSGS structures for symmetric groups.
//     */
//    private static final ArrayList<BaseStrongGeneratingElement>[] CACHED_SYMMETRIC_GROUPS = new ArrayList[SMALL_DEGREE_THRESHOLD];
//    /**
//     * Cached BSGS structures for antisymmetric groups.
//     */
//    private static final List<BaseStrongGeneratingElement>[] CACHED_ANTISYMMETRIC_GROUPS = new ArrayList[SMALL_DEGREE_THRESHOLD];
//    /**
//     * Cached BSGS structures for alternating groups.
//     */
//    private static final List<BaseStrongGeneratingElement>[] CACHED_ALTERNATING_GROUPS = new ArrayList[SMALL_DEGREE_THRESHOLD];
//
//    /**
//     * Creates base and strong generating set of alternating group of specified degree. Alternating group of degree
//     * smaller then {@link #SMALL_DEGREE_THRESHOLD} will provide zero-time access to all transversals in
//     * each stabilizer; group with larger degree will provide <i>log(size of orbit)</i> access. Additionally, small degree
//     * group with fixed degree will be constructed once (at the first invocation of this method with specified
//     * degree) and then cached, so second invocation of this method with same degree will return same reference.
//     *
//     * @param degree group degree
//     * @return base and strong generating set of symmetric group
//     */
//    public static List<BaseStrongGeneratingElement> createAlternatingGroupBSGS(final int degree) {
//        if (degree == 0) {
//            throw new IllegalArgumentException("Degree = 0.");
//        }
//
//        /* For alternating group we can construct BSGS explicitly without call of Schreier-Sims algorithm */
//
//        //For small degree groups we'll construct all BSGS elements with a "quick" access to all transversals
//        if (degree <= SMALL_DEGREE_THRESHOLD) {
//            List<BaseStrongGeneratingElement> bsgs = CACHED_ALTERNATING_GROUPS[degree - 1];
//            if (bsgs == null) {
//                bsgs = createAlternatingGroupBSGSForSmallDegree(degree);
//                CACHED_ALTERNATING_GROUPS[degree - 1] = bsgs;
//            }
//            return bsgs;
//        }
//
//        //For groups with large degree we'll construct all BSGS elements with a log(degree) access to all transversals
//        return createAlternatingGroupBSGSForLargeDegree(degree);
//    }
//
//    static List<BaseStrongGeneratingElement> createAlternatingGroupBSGSForSmallDegree(final int degree) {
//        if (degree < 3) {
//            return TRIVIAL_BSGS;
//        }
//
//        //For small groups we'll construct all BSGS elements with a "quick" access to all transversals, i.e.
//        // each stabilizer in chain will contain all required transversals. This involves to store
//        // ~(degree - 1)*degree/2 stabilizers
//
//
//        // Alt(n) generated by two elements:
//        // if degree is odd: p1 = (012) and (0,1,2,...,degree) (in cycle notation)
//        // if degree is even: p1 = (012) and (1,2,...,degree) (in cycle notation)
//
//        ArrayList<BaseStrongGeneratingElement> bsgs = new ArrayList<>();
//        ArrayList<IntegerPermutation> stabilizers = new ArrayList<>(degree);
//        for (int i = 0; i < degree - 2; ++i) {
//            ArrayList<Integer> orbit = new ArrayList<Integer>(degree - i);
//            for (int j = i; j < degree; ++j) {
//                orbit.add(j);
//            }
//
//            int[] mSchreierArray = new int[degree];
//            Arrays.fill(mSchreierArray, -2);
//            mSchreierArray[i] = -1;
//
//            //creating (012)
//            int[] perm = new int[degree];
//            for (int j = 1; j < i; ++j) {
//                perm[j] = j;
//            }
//
//            for (int j = i + 3; j < degree; ++j) {
//                perm[j] = j;
//            }
//
//            perm[i] = i + 1;
//            perm[i + 1] = i + 2;
//            perm[i + 2] = i;
//
//            //filling Schreier vector for (012)
//            mSchreierArray[i + 1] = stabilizers.size();
//            stabilizers.add(Permutations.createIntegerPermutation(perm));
//            mSchreierArray[i + 2] = stabilizers.size();
//            stabilizers.add(stabilizers.get(0).pow(2));
//
//            int inverseParity = 1 - ((degree - i) % 2);
//            IntegerPermutation base = inverseParity == 1 ? stabilizers.get(0) : stabilizers.get(0).getIdentity();
//            for (int k = 3; k < degree - i; ++k) {
//                perm = new int[degree];
//                for (int j = 1; j <= i; ++j) {
//                    perm[j] = j;
//                }
//
//                int j;
//                for (j = i + inverseParity; j < degree - k + inverseParity; ++j) {
//                    perm[j] = j + k - inverseParity;
//                }
//
//                for (int t = 0; j < degree; ++j, ++t) {
//                    perm[j] = i + inverseParity + t;
//                }
//
//                mSchreierArray[i + k] = stabilizers.size();
//                stabilizers.add(base.composition(Permutations.createIntegerPermutation(perm)));
//            }
//            bsgs.add(new BaseStrongGeneratingElement(i, new ArrayList<>(stabilizers), new mSchreierArray(mSchreierArray), orbit));
//            stabilizers.clear();
//        }
//        return bsgs;
//    }
//
//    static List<BaseStrongGeneratingElement> createAlternatingGroupBSGSForLargeDegree(final int degree) {
//        if (degree < 3) {
//            return TRIVIAL_BSGS;
//        }
//
//        //For groups with large degree we'll construct all BSGS elements with a log(degree) access to all transversals
//
//        // Alt(n) generated by two elements:
//        // if degree is odd: p1 = (012) and (0,1,2,...,degree) (in cycle notation)
//        // if degree is even: p1 = (012) and (1,2,...,degree) (in cycle notation)
//
//        ArrayList<BaseStrongGeneratingElement> bsgs = new ArrayList<>();
//        ArrayList<IntegerPermutation> stabilizers = new ArrayList<>(degree);
//        for (int i = 0; i < degree - 2; ++i) {
//
//            //creating (012)
//            int[] perm = new int[degree];
//            for (int j = 1; j < i; ++j) {
//                perm[j] = j;
//            }
//
//            for (int j = i + 3; j < degree; ++j) {
//                perm[j] = j;
//            }
//
//            perm[i] = i + 1;
//            perm[i + 1] = i + 2;
//            perm[i + 2] = i;
//
//            //filling Schreier vector for (012)
//            stabilizers.add(Permutations.createIntegerPermutation(perm));
//            stabilizers.add(stabilizers.get(0).pow(2));
//
//            int inverseParity = 1 - ((degree - i) % 2);
//            IntegerPermutation base = inverseParity == 1 ? stabilizers.get(0) : stabilizers.get(0).getIdentity();
//            int k;
//            //for (int k = 3; k < degree - i; ++k) {
//            for (int r = degree - i - 3; r > 0; r /= 2) {
//                k = r + 2;
//                perm = new int[degree];
//                for (int j = 1; j <= i; ++j) {
//                    perm[j] = j;
//                }
//
//                int j;
//                for (j = i + inverseParity; j < degree - k + inverseParity; ++j) {
//                    perm[j] = j + k - inverseParity;
//                }
//
//                for (int t = 0; j < degree; ++j, ++t) {
//                    perm[j] = i + inverseParity + t;
//                }
//
//                stabilizers.add(base.composition(Permutations.createIntegerPermutation(perm)));
//            }
//            bsgs.add(new BaseStrongGeneratingCandidateElement(i, new ArrayList<>(stabilizers), degree).asBaseStrongGeneratingElement());
//            stabilizers.clear();
//        }
//        return bsgs;
//    }
//
//    /**
//     * Creates base and strong generating set of symmetric group of specified degree. Symmetric group of degree
//     * smaller then {@link #SMALL_DEGREE_THRESHOLD} will provide zero-time access to all transversals in
//     * each stabilizer; group with larger degree will provide <i>log(size of orbit)</i> access. Additionally, small degree
//     * group with fixed degree will be constructed once (at the first invocation of this method with specified
//     * degree) and then cached, so second invocation of this method with same degree will return same reference.
//     *
//     * @param degree group degree
//     * @return base and strong generating set of symmetric group
//     */
//    public static ArrayList<BaseStrongGeneratingElement> createSymmetricGroupBSGS(final int degree) {
//        if (degree == 0) {
//            throw new IllegalArgumentException("Degree = 0.");
//        }
//
//        /* For symmetric group we can construct BSGS explicitly without call of Schreier-Sims algorithm */
//
//        //For small degree groups we'll construct all BSGS elements with a "quick" access to all transversals
//        if (degree <= SMALL_DEGREE_THRESHOLD) {
//            ArrayList<BaseStrongGeneratingElement> bsgs = CACHED_SYMMETRIC_GROUPS[degree - 1];
//            if (bsgs == null) {
//                bsgs = createSymmetricGroupBSGSForSmallDegree(degree);
//                CACHED_SYMMETRIC_GROUPS[degree - 1] = bsgs;
//            }
//            return bsgs;
//        }
//
//        //For groups with large degree we'll construct all BSGS elements with a log(degree) access to all transversals
//        return createSymmetricGroupBSGSForLargeDegree(degree);
//    }
//
//    static ArrayList<BaseStrongGeneratingElement> createSymmetricGroupBSGSForSmallDegree(final int degree) {
//        //For small groups we'll construct all BSGS elements with a "quick" access to all transversals, i.e.
//        // each stabilizer in chain will contain all required transversals. This involves to store
//        // (degree - 1)*degree/2 stabilizers
//
//        ArrayList<BaseStrongGeneratingElement> bsgs = new ArrayList<>(degree - 1);
//        for (int i = 0; i < degree - 1; ++i) {
//
//            //calculating orbit of i-th base point
//            ArrayList<Integer> orbit = new ArrayList<Integer>(degree - i);
//            int j = i;
//            for (; j < degree; ++j) {
//                orbit.add(j);
//            }
//
//            //calculating stabilizers
//            final IntegerPermutation[] stabilizers = new IntegerPermutation[degree - i - 1];
//
//
//            int[] mSchreierArray = new int[degree];
//            Arrays.fill(mSchreierArray, -2);
//            mSchreierArray[i] = -1;
//
//            int c = 0, permutation[], k;
//            for (j = i + 1; j < degree; ++j) {
//                permutation = new int[degree];
//                for (k = 1; k < degree; ++k) {
//                    permutation[k] = k;
//                }
//                permutation[j] = i;
//                permutation[i] = j;
//                stabilizers[c] = Permutations.createIntegerPermutation(permutation);
//                mSchreierArray[j] = c++;
//            }
//
//            BaseStrongGeneratingElement element = new BaseStrongGeneratingElement(i, Arrays.asList(stabilizers),
//                    new mSchreierArray(mSchreierArray), orbit);
//            bsgs.add(element);
//        }
//        return bsgs;
//    }
//
//    static ArrayList<BaseStrongGeneratingElement> createSymmetricGroupBSGSForLargeDegree(final int degree) {
//        //For groups with large degree we'll construct all BSGS elements with a log(degree) access to all transversals
//
//        ArrayList<BaseStrongGeneratingElement> bsgs = new ArrayList<>(degree - 1);
//        for (int i = 0; i < degree - 1; ++i) {
//
//            //calculating orbit of i-th base point
//            ArrayList<Integer> orbit = new ArrayList<Integer>(degree - i);
//            int j = i;
//            for (; j < degree; ++j) {
//                orbit.add(j);
//            }
//
//            //calculating stabilizers
//            final ArrayList<IntegerPermutation> stabilizers = new ArrayList<>((int) (FastMath.log(degree - i) / FastMath.log(2)));
//
//            //first stabilizer is transposition
//            int[] permutation = new int[degree];
//            for (j = 1; j < degree; ++j) {
//                permutation[j] = j;
//            }
//            permutation[i] = i + 1;
//            permutation[i + 1] = i;
//            stabilizers.add(Permutations.createIntegerPermutation(permutation));
//
//            int image, k, l;
//            //provide log(size of orbit) access
//            for (j = degree - i - 1; j > 0; j /= 2) {
//                //for each element in orbit
//                image = i + j;
//                permutation = new int[degree];
//                //all points before base point are fixed
//                for (k = 0; k < i; ++k) {
//                    permutation[k] = k;
//                }
//                //the rest of permutation should map i to i + j; we'll do this using cycles
//                l = 0;
//                for (; l < degree - image; ++k, ++l) {
//                    permutation[k] = image + l;
//                }
//                l = 0;
//                for (; k < degree; ++k) {
//                    permutation[k] = i + (l++);
//                }
//
//                stabilizers.add(Permutations.createIntegerPermutation(permutation));
//            }
//
//            //Collections.reverse(stabilizers);
//
//            BaseStrongGeneratingElement element = new BaseStrongGeneratingCandidateElement(i, stabilizers, degree).asBaseStrongGeneratingElement();
//            bsgs.add(element);
//        }
//        return bsgs;
//    }
//
//    /**
//     * Creates base and strong generating set of symmetric group of specified degree, where all odd permutations are
//     * antisymmetries. Symmetric group of degree smaller then {@link #SMALL_DEGREE_THRESHOLD} will provide zero-time
//     * access to all transversals in each stabilizer; group with larger degree will provide <i>log(size of orbit)</i>
//     * access. Additionally, small degree group with fixed degree will be constructed once (at the first invocation of
//     * this method with specified degree) and then cached, so second invocation of this method with same degree will
//     * return same reference.
//     *
//     * @param degree group degree
//     * @return base and strong generating set of symmetric group
//     */
//    public static List<BaseStrongGeneratingElement> createAntisymmetricGroupBSGS(final int degree) {
//        if (degree == 0) {
//            throw new IllegalArgumentException("Degree = 0.");
//        }
//
//        /* For symmetric group we can construct BSGS explicitly without call of Schreier-Sims algorithm */
//
//        //For small degree groups we'll construct all BSGS elements with a "quick" access to all transversals
//        if (degree <= SMALL_DEGREE_THRESHOLD) {
//            List<BaseStrongGeneratingElement> bsgs = CACHED_ANTISYMMETRIC_GROUPS[degree - 1];
//            if (bsgs == null) {
//                bsgs = convertToAntisymmetric(createSymmetricGroupBSGS(degree));
//                CACHED_ANTISYMMETRIC_GROUPS[degree - 1] = bsgs;
//            }
//            return bsgs;
//        }
//
//        //For groups with large degree we'll construct all BSGS elements with a log(degree) access to all transversals
//        return convertToAntisymmetric(createSymmetricGroupBSGS(degree));
//    }
//
//    private static ArrayList<BaseStrongGeneratingElement> convertToAntisymmetric(ArrayList<BaseStrongGeneratingElement> symmetricGroup) {
//        ArrayList<BaseStrongGeneratingCandidateElement> bsgs = asBSGSCandidatesList(symmetricGroup);
//        for (BaseStrongGeneratingCandidateElement c : bsgs) {
//            ListIterator<IntegerPermutation> stabs = c.getStabilizerGeneratorsReference().listIterator();
//            while (stabs.hasNext()) {
//                IntegerPermutation p = stabs.next();
//                if (p.parity() == 1) {
//                    stabs.set(Permutations.createIntegerPermutation(true, p.oneLine()));
//                }
//            }
//        }
//        return asBSGSList(bsgs);
//    }

  /**
   * Makes a mutable copy of BSGS.
   * @param bsgs BSGS
   * @return mutable copy of BSGS
   */
  public static ArrayList<BaseStrongGeneratingCandidateElement> asBSGSCandidatesList(final List<? extends BaseStrongGeneratingElement> bsgs) {
    final ArrayList<BaseStrongGeneratingCandidateElement> bsgsCandidates = new ArrayList<>(bsgs.size());
    for (final BaseStrongGeneratingElement element : bsgs) {
      bsgsCandidates.add(element.asBaseStrongGeneratingCandidateElement());
    }
    return bsgsCandidates;
  }

  /**
   * Makes an immutable copy of BSGS.
   * @param bsgsCandidate BSGS
   * @return immutable copy of BSGS
   */
  public static ArrayList<BaseStrongGeneratingElement> asBSGSList(final List<? extends BaseStrongGeneratingElement> bsgsCandidate) {
    final ArrayList<BaseStrongGeneratingElement> bsgs = new ArrayList<>(bsgsCandidate.size());
    for (final BaseStrongGeneratingElement element : bsgsCandidate) {
      bsgs.add(element.asBaseStrongGeneratingElement());
    }
    return bsgs;
  }

//    /**
//     * Returns base represented as array
//     *
//     * @param BSGS BSGS
//     * @return base represented as array
//     */
//    public static int[] getBaseAsArray(final List<? extends BaseStrongGeneratingElement> BSGS) {
//        return getBaseAsArray(BSGS, 0);
//    }
//
//    static int[] getBaseAsArray(final List<? extends BaseStrongGeneratingElement> BSGS, int from) {
//        int[] base = new int[BSGS.size() - from];
//        for (int i = from, size = BSGS.size(); i < size; ++i) {
//            base[i - from] = BSGS.get(i).mBasePoint;
//        }
//        return base;
//    }
//
//    /**
//     * Returns a deep copy of specified list
//     *
//     * @param BSGSCandidate BSGS candidate
//     * @return deep copy of specified list
//     */
//    public static ArrayList<BaseStrongGeneratingCandidateElement> clone(List<BaseStrongGeneratingCandidateElement> BSGSCandidate) {
//        ArrayList<BaseStrongGeneratingCandidateElement> copy = new ArrayList<>(BSGSCandidate);
//        ListIterator<BaseStrongGeneratingCandidateElement> it = copy.listIterator();
//        while (it.hasNext()) {
//            it.set(it.next().clone());
//        }
//        return copy;
//    }
}
