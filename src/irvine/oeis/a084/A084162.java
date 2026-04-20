package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002313;

/**
 * A084162 a(n) is the length of the gap in sequence A084161.
 * @author Sean A. Irvine
 */
public class A084162 extends Sequence0 {

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
        return gap;
      }
    }
  }
}

