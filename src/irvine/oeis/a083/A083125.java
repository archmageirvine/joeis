package irvine.oeis.a083;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083051.
 * @author Sean A. Irvine
 */
public class A083125 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      mSeen.add(Z.ONE);
      return Z.ONE;
    }
    final Sequence palin = new A002113().skip(2);
    while (true) {
      final Z p = palin.next();
      final Z[] qr = p.divideAndRemainder(mA);
      if (qr[1].isZero() && mSeen.add(qr[0])) {
        mA = qr[0];
        return mA;
      }
    }
  }
}

