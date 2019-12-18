package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A001167 Smallest natural number requiring n words in English (as spoken in England).
 * @author Sean A. Irvine
 */
public class A001167 implements Sequence {

  private int mN = 0;

  static int wordCount(final int v) {
    final String eng = English.SINGLETON.toText(v);
    int c = 1;
    for (int k = 3; k < eng.length(); ++k) {
      final char ch = eng.charAt(k);
      if (ch == ' ' || ch == '-') {
        ++c;
      }
    }
    return c;
  }

  @Override
  public Z next() {
    ++mN;
    int v = 0;
    while (++v > 0 && wordCount(v) != mN) {
    }
    if (v < 0) {
      throw new UnsupportedOperationException();
    }
    //System.out.println(mN + " " + English.toEnglish(v));
    return Z.valueOf(v);
  }
}
