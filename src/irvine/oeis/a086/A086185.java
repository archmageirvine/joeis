package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A086185 In decimal expansion of Pi: smallest position between n and 2*n where the greatest number begins which is also contained in the first n positions.
 * @author Sean A. Irvine
 */
public class A086185 extends Sequence1 {

  private final Sequence mPi = new A000796();
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
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
          final int i = b.indexOf(query);
          if (i >= 0) {
            final Z t = new Z(query);
            if (t.compareTo(best) > 0) {
              best = t;
              pos = i;
            }
          }
        }
      }
      if (best.signum() >= 0) {
        return Z.valueOf(a.length() + pos);
      }
    }
    throw new RuntimeException();
  }
}
