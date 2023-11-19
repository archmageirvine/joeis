package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A078008 Expansion of (1-x)/( (1+x)*(1-2*x) ).
 * @author Sean A. Irvine
 */
public class A078008 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A078008() {
    super(new long[] {2, 1}, new long[] {1, 0});
  }

  @Override
  public Z a(final Z n) {
    // a(n) = (2^n + 2*(-1)^n)/3.
    return Z.TWO.pow(n).add(Z.NEG_ONE.pow(n).multiply2()).divide(3);
  }

  @Override
  public Z a(final int n) {
    return Z.TWO.pow(n).add(Z.NEG_ONE.pow(n).multiply2()).divide(3);
  }
}
