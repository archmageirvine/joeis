package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A019271 A self-descriptive sequence: positions of consonants in "zero, two, four, ...".
 * @author Sean A. Irvine
 */
public class A019271 extends Sequence0 {

  private final StringBuilder mBuilder = new StringBuilder();
  private int mPos = 0;

  private boolean vowel(final int pos) {
    final char c = mBuilder.charAt(pos);
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }

  @Override
  public Z next() {
    if (mBuilder.length() == 0) {
      mBuilder.append("zero");
      return Z.ZERO;
    }
    while (vowel(++mPos)) {
      // do nothing
    }
    mBuilder.append(English.SINGLETON.toRawText(mPos));
    //System.out.println(mBuilder.toString());
    return Z.valueOf(mPos);
  }
}

