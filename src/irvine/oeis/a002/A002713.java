package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002713 Number of unrooted triangulations of the disk with n interior nodes and 3 nodes on the boundary.
 * @author Sean A. Irvine
 */
public class A002713 extends A002712 {

  private final A002709 mA = new A002709();

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}

