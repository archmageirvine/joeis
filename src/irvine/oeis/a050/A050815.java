package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A050815 Number of positive Fibonacci numbers with n decimal digits.
 * @author Sean A. Irvine
 */
public class A050815 extends A000045 {

  {
    setOffset(1);
    super.next(); // skip 0
  }
  private int mA = super.next().toString().length();

  @Override
  public Z next() {
    final int len = mA;
    int count = 0;
    do {
      ++count;
      mA = super.next().toString().length();
    } while (mA == len);
    return Z.valueOf(count);
  }
}
