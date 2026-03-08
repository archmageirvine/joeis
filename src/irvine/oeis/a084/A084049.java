package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a034.A034690;

/**
 * A084049 Numbers k such that k and k+1 have the same sum of digits of divisors; A034690(k) = A034690(k+1).
 * @author Sean A. Irvine
 */
public class A084049 extends Sequence1 {

  private final Sequence mS = new A034690();
  private Z mA = mS.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mS.next();
      if (t.equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}

