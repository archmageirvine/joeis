package irvine.math.group;

import java.util.Arrays;

import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;

/**
 * The simple sporadic Mathieu group of degree 11.
 * @author Sean A. Irvine
 */
public class Mathieu11 extends Generator<Permutation<Integer>> {

  private static final Permutation<Integer> GEN_A = Permutation.create(1, 10, 3, 11, 7, 6, 5, 9, 8, 2, 4);
  private static final Permutation<Integer> GEN_B = Permutation.create(4, 5, 8, 3, 6, 9, 7, 1, 2, 10, 11);
  private static final FiniteSet<Permutation<Integer>> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the Mathieu group of degree 11.
   */
  public Mathieu11() {
    super(SymmetricGroup.create(11), GENERATORS, false);
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
    return "M_{11}";
  }
}
