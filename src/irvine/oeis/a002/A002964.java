package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002964.
 * @author Sean A. Irvine
 */
public class A002964 extends A002963 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (super.next().intValueExact() != mN) {
      ++mM;
    }
    return Z.valueOf(++mM);
  }
}
