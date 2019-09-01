package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025486 Least k with <code>A025255(k) = n</code>.
 * @author Sean A. Irvine
 */
public class A025486 extends A025485 {

  private Z mN = Z.NEG_ONE;
  private long mM = -1;

  @Override
  public Z next() {
    mN = mN.add(1);
    do {
      ++mM;
    } while (!super.next().equals(mN));
    return Z.valueOf(mM);
  }
}

