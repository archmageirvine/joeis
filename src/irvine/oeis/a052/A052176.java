package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052176 Triangle of numbers arising in enumeration of walks on square lattice.
 * @author Sean A. Irvine
 */
public class A052176 extends A052175 {

  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    return (mM & 1) == 1 ? Z.ZERO : t(mN, mM / 2);
  }
}
