package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000702 a(n) is the number of conjugacy classes in the alternating group A_n.
 * @author Sean A. Irvine
 */
public class A000702 extends A000700 {

  /** Construct the sequence. */
  public A000702() {
    super(1);
  }

  private final A000041 mA41 = new A000041();
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      super.next();
      mA41.next();
      super.next();
      mA41.next();
      return Z.ONE;
    }
    return mA41.next().add(super.next().multiply(3)).divide2();
  }
}

