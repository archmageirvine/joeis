package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007344 Number of homogeneous primitive partition identities of degree 6 with largest part n.
 * @author Sean A. Irvine
 */
public class A007344 extends A007343 {

  /** Construct the sequence. */
  public A007344() {
    super(4);
  }

  private int mN = 3;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    mA = mA.add(get(mN, 3));
    return mA;
  }
}
