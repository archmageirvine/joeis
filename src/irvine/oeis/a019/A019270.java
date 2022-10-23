package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A019270 A self-descriptive sequence: positions of vowels in "one, three, seven,...".
 * @author Sean A. Irvine
 */
public class A019270 extends Sequence1 {

  private final StringBuilder mBuilder = new StringBuilder();
  private int mPos = 2;

  private boolean vowel(final int pos) {
    final char c = mBuilder.charAt(pos);
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }

  @Override
  public Z next() {
    if (mBuilder.length() == 0) {
      mBuilder.append("Xone");
      return Z.ONE;
    }
    while (!vowel(++mPos)) {
      // do nothing
    }
    mBuilder.append(English.SINGLETON.toRawText(mPos));
    //System.out.println(mBuilder.toString());
    return Z.valueOf(mPos);
  }
}

