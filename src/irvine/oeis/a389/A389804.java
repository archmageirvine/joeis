package irvine.oeis.a389;

import irvine.math.z.Z;

/**
 * A389804 a(n) = A389802(2*n).
 * @author Sean A. Irvine
 */
public class A389804 extends A389802 {

  private int mN = 0;

  /** Construct the sequence. */
  public A389804() {
    super(1);
  }

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(buildIrreducibleBalancedSamples(mN).size());
  }
}
