package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392041 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A392041 extends Sequence1 {

  private final StringBuilder mS = new StringBuilder();
  private long mN = 0;
  private Z mMin = null;

  private void search(final String s, final int cnt) {
    if (cnt == 0) {
      if (s.charAt(0) != '0' && (s.charAt(s.length() - 1) & 1) == 1) {
        final Z t = new Z(s);
        if ((mMin == null || t.compareTo(mMin) < 0) && t.isProbablePrime()) {
          mMin = t;
        }
      }
      return;
    }
    for (int d = 0; d < 10; ++d) {
      search(d + s, cnt - 1);
      search(s + d, cnt - 1);
    }
  }

  @Override
  public Z next() {
    mS.append(++mN);
    final String s = mS.toString();
    mMin = null;
    int k = -1;
    while (mMin == null) {
      search(s, ++k);
    }
    return mMin;
  }
}
