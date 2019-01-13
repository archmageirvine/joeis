package irvine.math.group;

import java.util.Arrays;

import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;

/**
 * The simple sporadic Mathieu group of degree 22.
 * @author Sean A. Irvine
 */
public class Mathieu22 extends IntegerPermutationGroup {

  private static final IntegerPermutation GEN_A = IntegerPermutation.createFromOneBase(13, 8, 16, 12, 5, 22, 17, 2, 10, 9, 14, 4, 1, 11, 15, 3, 7, 18, 19, 20, 21, 6);
  private static final IntegerPermutation GEN_B = IntegerPermutation.createFromOneBase(22, 18, 21, 13, 12, 11, 15, 14, 9, 8, 7, 5, 2, 20, 6, 16, 19, 4, 17, 10, 1, 3);
  private static final FiniteSet<IntegerPermutation> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the Mathieu group of degree 22.
   * Note constructing this group is quite slow.
   */
  public Mathieu22() {
    super(22, GENERATORS, false);
  }

  @Override
  public boolean isSimple() {
    return true;
  }

  @Override
  public boolean isAbelian() {
    return false;
  }

  /**
   * The permutations generating the group.
   * @return generators
   */
  public Set<IntegerPermutation> getGenerators() {
    return GENERATORS;
  }

  @Override
  public String toString() {
    return "M_{22}";
  }
}
