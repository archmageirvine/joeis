package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A139133 A self-descriptive sequence: positions of consonants in "two, one, five, seven, nine, eleven, thirteen, fifteen, <code>..</code>.".
 * @author Sean A. Irvine
 */
public class A139133 implements Sequence {

  private final StringBuilder mBuilder = new StringBuilder();
  private int mPos = 0;

  private boolean vowel(final int pos) {
    final char c = mBuilder.charAt(pos);
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }

  @Override
  public Z next() {
    if (mBuilder.length() == 0) {
      mBuilder.append("Xtwo");
      return Z.TWO;
    }
    while (vowel(++mPos) || mPos == 2) {
      // do nothing
    }
    mBuilder.append(English.toRawEnglish(mPos));
    //System.out.println(mBuilder.toString());
    return Z.valueOf(mPos);
  }
}

