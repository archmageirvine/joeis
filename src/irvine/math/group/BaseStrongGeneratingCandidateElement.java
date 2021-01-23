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

/**
 * A mutable version of {@link BaseStrongGeneratingElement}.
 *
 * @author Dmitry Bolotin
 * @author Stanislav Poslavsky
 */
public final class BaseStrongGeneratingCandidateElement extends BaseStrongGeneratingElement {

  /**
   * Basic raw constructor.
   * @param basePoint base point
   * @param stabilizerGenerators stabilizers
   */
  BaseStrongGeneratingCandidateElement(final int basePoint, final List<IntegerPermutation> stabilizerGenerators) {
    this(basePoint, stabilizerGenerators, calculateSVCapacity(stabilizerGenerators));
    mInternalDegree = mSchreierArray.length();
  }

  /**
   * Calculates minimal capacity needed to store Schreier vector
   * @param stabilizerGenerators stabilizers
   * @return minimal capacity needed to store Schreier vector
   */
  private static int calculateSVCapacity(final List<IntegerPermutation> stabilizerGenerators) {
    int capacity = -1;
    for (final IntegerPermutation p : stabilizerGenerators) {
      capacity = Math.max(capacity, p.degree());
    }
    return capacity;
  }

  /**
   * Basic raw constructor.
   * @param basePoint base point
   * @param stabilizerGenerators stabilizers
   * @param schreierVectorCapacity initial capacity of Schreier vector
   */
  BaseStrongGeneratingCandidateElement(final int basePoint, final List<IntegerPermutation> stabilizerGenerators, final int schreierVectorCapacity) {
    super(basePoint, stabilizerGenerators, new SchreierArray(), new ArrayList<>());
    assert stabilizerGenerators instanceof ArrayList;
    //creating list of orbit points
    mOrbitList.add(basePoint);
    recalculateOrbitAndSchreierVector();
  }

  private BaseStrongGeneratingCandidateElement(final int basePoint, final List<IntegerPermutation> stabilizerGenerators,
                                               final SchreierArray schreierArray, final ArrayList<Integer> orbitList) {
    super(basePoint, stabilizerGenerators, schreierArray, orbitList);
  }

  void addStabilizer(final IntegerPermutation stabilizer) {
    mInternalDegree = Math.max(mInternalDegree, stabilizer.degree());
    mStabilizerGenerators.add(stabilizer);
    recalculateOrbitAndSchreierVector();
  }

  /**
   * Calculates Schreier vector according to the algorithm {@code ORBITSV} in Sec. 4.1.1 of  <b>[Holt05]</b>
   */
  void recalculateOrbitAndSchreierVector() {
    // clear orbit list (remember only first element)
    final int t = mOrbitList.get(0);
    mOrbitList.clear();
    mOrbitList.add(t);
    // fill Schreier vector with some dummy values
    mSchreierArray.truncate(0);
    // base point
    mSchreierArray.set(mBasePoint, -1);

    // main loop over all points in orbit
    for (int orbitIndex = 0; orbitIndex < mOrbitList.size(); ++orbitIndex) {
      // loop over all generators of a group
      for (int stabilizerIndex = 0, size = mStabilizerGenerators.size(); stabilizerIndex < size; ++stabilizerIndex) {
        // image of point under permutation
        final int imageOfPoint = mStabilizerGenerators.get(stabilizerIndex).image(mOrbitList.get(orbitIndex));
        // testing whether current permutation maps orbit point into orbit or not
        if (mSchreierArray.get(imageOfPoint) == -2) {
          // adding new point to orbit
          mOrbitList.add(imageOfPoint);
          // filling Schreier vector
          mSchreierArray.set(imageOfPoint, stabilizerIndex);
        }
      }
    }
  }

  /**
   * Returns a subset of {@code mStabilizerGenerators} that fix this base point.
   * @return a subset of {@code mStabilizerGenerators} that fix this base point
   */
  public List<IntegerPermutation> getStabilizersOfThisBasePoint() {
    final ArrayList<IntegerPermutation> basePointStabilizers = new ArrayList<>();
    for (final IntegerPermutation previousPointsStabilizer : mStabilizerGenerators) {
      if (previousPointsStabilizer.image(mBasePoint) == mBasePoint) {
        basePointStabilizers.add(previousPointsStabilizer);
      }
    }
    return basePointStabilizers;
  }

  /**
   * Returns an immutable representation of this _BSGS element
   * @return immutable representation of this _BSGS element
   */
  @Override
  public BaseStrongGeneratingElement asBaseStrongGeneratingElement() {
    return new BaseStrongGeneratingElement(mBasePoint, Collections.unmodifiableList(mStabilizerGenerators), mSchreierArray, new ArrayList<>(mOrbitList));
  }

  @Override
  public BaseStrongGeneratingCandidateElement asBaseStrongGeneratingCandidateElement() {
    return this;
  }
}
