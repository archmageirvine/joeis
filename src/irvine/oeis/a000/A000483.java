package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000483 Associated Stirling numbers: second-order reciprocal Stirling numbers (Fekete) a(n) = [[n, 3]]. The number of 3-orbit permutations of an n-set with at least 2 elements in each orbit.
 * @author Sean A. Irvine
 */
public class A000483 extends AbstractSequence {

  /** Construct the sequence. */
  public A000483() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return Functions.ASSOCIATED_STIRLING1.z(++mN, 3);
  }
}
