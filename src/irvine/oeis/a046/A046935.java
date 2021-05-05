package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046935 Sequence formed from rows of triangle A046934.
 * @author Sean A. Irvine
 */
public class A046935 extends A046934 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
