package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028978 Product of prime and previous prime is palindromic.
 * @author Sean A. Irvine
 */
public class A028978 extends A028888 {

  @Override
  public Z next() {
    super.next();
    return mPrev;
  }
}
