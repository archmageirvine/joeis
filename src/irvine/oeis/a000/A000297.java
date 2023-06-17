package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000297 a(n) = (n+1)*(n+3)*(n+8)/6.
 * @author Sean A. Irvine
 */
public class A000297 extends AbstractSequence {

  /** Construct the sequence. */
  public A000297() {
    super(-1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mN + 2).multiply(mN + 7).divide(6);
  }
}
