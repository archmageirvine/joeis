package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a036.A036012;

/**
 * A057999 a(n) is smallest prime such that a(n)-1 is a proper multiple of a(n-1)-1, with a(0) = 2.
 * @author Sean A. Irvine
 */
public class A057999 extends A036012 {

  /** Construct the sequence. */
  public A057999() {
    super(0);
  }

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(super.next());
    return mA.add(1);
  }
}
