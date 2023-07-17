package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a091.A091599;

/**
 * A046651 Triangle of rooted planar maps.
 * @author Sean A. Irvine
 */
public class A046651 extends A091599 {

  /** Construct the sequence. */
  public A046651() {
    super(0);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return t(mN, mM);
  }
}
