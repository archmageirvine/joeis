package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001556 <code>a(n) = 1^n + 2^n +</code> ... <code>+ 9^n</code>.
 * @author Sean A. Irvine
 */
public class A001556 extends A001555 {

  private Z mNine = null;

  @Override
  public Z next() {
    if (mNine == null) {
      mNine = Z.ONE;
    } else {
      mNine = mNine.multiply(9);
    }
    return mNine.add(super.next());
  }
}
