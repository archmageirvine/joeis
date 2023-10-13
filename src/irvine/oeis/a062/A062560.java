package irvine.oeis.a062;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062560 The first few denominators in the odd-greedy expansion of 5/139.
 * @author Sean A. Irvine
 */
public class A062560 extends Sequence0 {

  private static final long N = 5;
  private static final long D = 139;
  private Q mA = new Q(N, D);
  private Z mD = null;
  private long mN = N;

  @Override
  public Z next() {
    if (mA.isZero()) {
      return null;
    }
    if (mD == null) {
      mD = Z.valueOf(1 + (D + 1) / N);
    } else {
      final Z d2 = mD.square();
      final Z[] qr = d2.subtract(1).divideAndRemainder(Z.valueOf(++mN));
      if (!qr[1].isZero()) {
        // Is this restart of N/D correct? -- it doesn't terminate at the point indicated in the OEIS
        mD = mA.den().add(1).divide(mA.num()).add(1);
        mN = mA.num().longValueExact();
      } else {
        mD = d2.subtract(mD).add(1).subtract(qr[0]);
      }
    }
    mA = mA.subtract(new Q(Z.ONE, mD));
    return mD;
  }
}

