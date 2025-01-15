package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074214 Integers m such that F(m) and F(2m) have the same largest prime factor where F(k) denotes the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A074214 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GPF.z(Functions.FIBONACCI.z(++mN)).equals(Functions.GPF.z(Functions.FIBONACCI.z(2 * mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
