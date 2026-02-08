package irvine.oeis.a392;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.a376.A376926;

/**
 * A392812 The z values of solutions to x + y = z with x &gt;= y, x and y coprime, and the distinct prime factors of x*y*z are consecutive primes starting with 2.
 * @author Sean A. Irvine
 */
public class A392812 extends A376926 {

  private final LinkedList<Z> mA = new LinkedList<>();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final long t = super.next().longValueExact();
      final Z n = Z.valueOf(mN);
      for (long k = 0; k < t; ++k) {
        mA.add(n);
      }
    }
    return mA.pollFirst();
  }
}
