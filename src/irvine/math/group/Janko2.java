package irvine.math.group;

import java.util.Arrays;

import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;

/**
 * The simple sporadic Janko group 2.
 * @author Sean A. Irvine
 */
public class Janko2 extends IntegerPermutationGroup {

  private static final IntegerPermutation GEN_A = IntegerPermutation.createFromOneBase(
    84, 20, 48, 56, 82, 67, 55, 41, 35, 40, 78, 100, 49, 37, 94, 76, 19, 44, 17, 2, 34, 85, 92, 57, 75,
    28, 64, 26, 90, 97, 38, 68, 69, 21, 9, 53, 14, 31, 61, 10, 8, 73, 91, 18, 86, 81, 89, 3, 13, 93,
    96, 72, 36, 74, 7, 4, 24, 99, 95, 63, 39, 83, 60, 27, 70, 88, 6, 32, 33, 65, 87, 52, 42, 54, 25,
    16, 98, 11, 80, 79, 46, 5, 62, 1, 22, 45, 71, 66, 47, 29, 43, 23, 50, 15, 59, 51, 30, 77, 58, 12);
  private static final IntegerPermutation GEN_B = IntegerPermutation.createFromOneBase(
    80, 9, 53, 23, 51, 37, 7, 27, 11, 62, 2, 65, 64, 61, 98, 73, 39, 5, 13, 97, 96, 1, 78, 6, 15,
    93, 60, 57, 71, 69, 12, 16, 17, 86, 28, 36, 24, 59, 33, 43, 41, 68, 91, 42, 30, 85, 10, 76, 92, 66,
    18, 14, 87, 95, 29, 54, 35, 20, 94, 8, 52, 47, 74, 19, 31, 88, 21, 44, 45, 81, 55, 63, 32, 72, 70,
    90, 49, 4, 100, 22, 75, 34, 79, 84, 89, 82, 3, 50, 46, 48, 40, 77, 99, 38, 56, 67, 58, 25, 26, 83);
  private static final FiniteSet<IntegerPermutation> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));

  /**
   * Create the Janko group 2.
   */
  public Janko2() {
    super(100, GENERATORS, false);
  }

  @Override
  public boolean isSimple() {
    return true;
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
    return "J_2";
  }
}
