package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076951 Smallest k &gt; 0 such that nk-1 is an n-th power, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A076951 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z[] qr = Z.valueOf(++k).pow(mN).add(1).divideAndRemainder(mN);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

