package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068945 Number of ones in the binary expansion of A068943(n).
 * @author Sean A. Irvine
 */
public class A068945 extends A068943 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return Z.valueOf(super.next().bitCount());
  }
}

