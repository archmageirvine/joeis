package irvine.oeis.a389;

import irvine.math.z.Z;

/**
 * A389803 a(n) = A389802(2n+1).
 * @author Sean A. Irvine
 */
public class A389803 extends A389802 {

  private int mN = -1;

  /** Construct the sequence. */
  public A389803() {
    super(0);
  }

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(buildIrreducibleBalancedSamples(mN).size());
  }
}
