package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025742 <code>a(n)</code> is the index of <code>10^n</code> within sequence of numbers of form <code>4^i*10^j</code>.
 * @author Sean A. Irvine
 */
public class A025742 extends A025621 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(10);
    return Z.valueOf(mN);
  }
}
