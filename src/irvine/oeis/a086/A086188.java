package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A086188 a(n) = A086184(A086187(n)).
 * @author Sean A. Irvine
 */
public class A086188 extends Sequence1 {

  private final Sequence mPi = new A000796();
  private final StringBuilder mS = new StringBuilder();
  private Z mRecord = Z.ZERO;

  @Override
  public Z next() {
    outer:
    while (true) {
      mS.append(mPi.next());
      if (mS.length() > 1) {
        mS.append(mPi.next());
      }
      final String a = mS.substring(0, mS.length() / 2 + 1);
      final String b = mS.substring(mS.length() / 2);
      Z best = Z.NEG_ONE;
      long pos = 0;
      for (int k = a.length(); k > 0; --k) {
        for (int j = 0; j + k <= a.length(); ++j) {
          if (k == 1 || a.charAt(j) != '0') {
            final String query = a.substring(j, j + k);
            if (b.contains(query)) {
              final Z t = new Z(query);
              if (t.compareTo(best) > 0) {
                best = t;
                pos = j;
              }
            }
          }
        }
        if (best.signum() >= 0) {
          if (best.compareTo(mRecord) > 0) {
            mRecord = best;
            return Z.valueOf(pos + 1);
          }
          continue outer;
        }
      }
      throw new RuntimeException();
    }
  }
}
