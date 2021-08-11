package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a001.A001122;

/**
 * A071642 Numbers n such that x^n + x^(n-1) + x^(n-2) + ... + x + 1 is irreducible over GF(2).
 * @author Sean A. Irvine
 */
public class A071642 extends A001122 {

  private boolean mFirst = true;
  private boolean mSecond = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    } else if (mSecond) {
      mSecond = false;
      return Z.ONE;
    } else {
      return super.next().subtract(1);
    }
  }
}
