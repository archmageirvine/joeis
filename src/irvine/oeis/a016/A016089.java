package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A016089 Numbers n such that n divides n-th Lucas number <code>A000032(n)</code>.
 * @author Sean A. Irvine
 */
public class A016089 extends A000032 {

  // There are faster (i.e. better) ways to do this (e.g. using matrix powers mod n)

  private long mN = 0;

  {
    super.next(); // skip 0th term
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
