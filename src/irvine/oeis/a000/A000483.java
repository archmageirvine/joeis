package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000483 Associated Stirling numbers: second order reciprocal Stirling numbers (Fekete) [[n, 3]]. The number of 3-orbit permutations of an n-set with at least 2 elements in each orbit.
 * @author Sean A. Irvine
 */
public class A000483 extends AbstractSequence {

  /* Construct the sequence. */
  public A000483() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return Stirling.associatedFirstKind(++mN, 3);
  }
}
