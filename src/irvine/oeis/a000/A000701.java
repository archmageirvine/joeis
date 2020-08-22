package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000701 One half of number of non-self-conjugate partitions; also half of number of asymmetric Ferrers graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A000701 extends A000700 {

  private final A000041 mA41 = new A000041();

  @Override
  public Z next() {
    return mA41.next().subtract(super.next()).divide(2);
  }
}

