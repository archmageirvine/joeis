package irvine.oeis.a353;

import irvine.math.z.Z;

/**
 * A353313 If n is of the form 3k, then a(n) = k, and if n is of the form 3k+r, with r = 1 or 2, then a(n) = 5*k + 3 + r.
 * @author Gregory Morse
 */
public class A353313 extends A353314 {
  private long mN = -1;

  @Override
  public Z next() {
    final Z t = super.next();
    return ++mN % 3 == 0 ? t.divide(3) : t;
  }
}
