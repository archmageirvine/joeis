package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002313;

/**
 * A084161 Primes that are the sum of two squares and which set a record for the gap to the next prime of that form.
 * @author Sean A. Irvine
 */
public class A084161 extends Sequence1 {

  private final Sequence mS = new A002313();
  private Z mA = mS.next();
  private Z mRecord = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mS.next();
      final Z gap = mA.subtract(t);
      if (gap.compareTo(mRecord) > 0) {
        mRecord = gap;
        return t;
      }
    }
  }
}

