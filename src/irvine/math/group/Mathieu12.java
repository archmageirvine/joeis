package irvine.math.group;

import java.util.Arrays;

import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;

/**
 * The simple sporadic Mathieu group of degree 12.
 * @author Sean A. Irvine
 */
public class Mathieu12 extends Generator<Permutation<Integer>> {

  private static final Permutation<Integer> GEN_A = Permutation.create(4, 2, 10, 1, 11, 12, 7, 8, 9, 3, 5, 6);
  private static final Permutation<Integer> GEN_B = Permutation.create(8, 3, 4, 2, 12, 10, 6, 9, 1, 7, 5, 11);
  private static final FiniteSet<Permutation<Integer>> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the Mathieu group of degree 12.
   */
  public Mathieu12() {
    super(SymmetricGroup.create(12), GENERATORS, false);
  }

  @Override
  public boolean isSimple() {
    return true;
  }

  /**
   * The permutations generating the group.
   * @return generators
   */
  public Set<Permutation<Integer>> getGenerators() {
    return GENERATORS;
  }

  @Override
  public String toString() {
    return "M_{12}";
  }
}
