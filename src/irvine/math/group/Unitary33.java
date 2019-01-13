package irvine.math.group;

import java.util.Arrays;

import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;

/**
 * The unitary group U3(3).
 * @author Sean A. Irvine
 */
public class Unitary33 extends Generator<Permutation<Integer>> {

  private static final Permutation<Integer> GEN_A = Permutation.create(1, 3, 2, 6, 8, 4, 11, 5, 13, 15, 7, 14, 9, 12, 10, 20, 22, 23, 19, 16, 21, 17, 18, 27, 28, 26, 24, 25);
  private static final Permutation<Integer> GEN_B = Permutation.create(2, 4, 5, 7, 9, 10, 12, 11, 14, 13, 16, 17, 18, 19, 15, 21, 1, 24, 22, 25, 26, 3, 6, 23, 27, 28, 20, 8);
  private static final FiniteSet<Permutation<Integer>> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the unitary group U3(3).
   */
  public Unitary33() {
    super(SymmetricGroup.create(28), GENERATORS, false);
  }

  @Override
  public boolean isSimple() {
    return true;
  }

  /**
   * The permutations generating the group.
   *
   * @return generators
   */
  public Set<Permutation<Integer>> getGenerators() {
    return GENERATORS;
  }

  @Override
  public String toString() {
    return "U_3(3)";
  }
}
