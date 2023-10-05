package irvine.math.group;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;

/**
 * The simple sporadic Higman-Sims group.
 * @author Sean A. Irvine
 */
public class HigmanSims extends IntegerPermutationGroup {

  private static final int PARENT_SIZE = 100;
  private static final IntegerPermutation GEN_A = IntegerPermutation.createFromOneBase(IntegerUtils.readInNumbers("irvine/math/group/resources/hsa.dat"));
  private static final IntegerPermutation GEN_B = IntegerPermutation.createFromOneBase(IntegerUtils.readInNumbers("irvine/math/group/resources/hsb.dat"));
  private static final FiniteSet<IntegerPermutation> GENERATORS = new FiniteSet<>(Arrays.asList(GEN_A, GEN_B));
  private static final IntegerPermutation ZERO = IntegerPermutation.identity(PARENT_SIZE);

  /**
   * Construct the Higman-Sims group.
   */
  public HigmanSims() {
    super(PARENT_SIZE, GENERATORS, true);
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
  public IntegerPermutation zero() {
    return ZERO;
  }

  @Override
  public String toString() {
    return "HS";
  }
}
