package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.French;

/**
 * A139132 The following sequence of French words has the property that it tells which letters in the sequence are vowels: un, quatre, cinq, huit, dix, quatorze, quinze, dix-huit, vingt et un, vingt-deux, ... Now replace the words with their numerical values.
 * @author Sean A. Irvine
 */
public class A139132 implements Sequence {

  private final StringBuilder mBuilder = new StringBuilder();
  private int mPos = 3;

  private boolean vowel(final int pos) {
    final char c = mBuilder.charAt(pos);
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }

  @Override
  public Z next() {
    if (mBuilder.length() == 0) {
      mBuilder.append("Xunquatre");
      return Z.ONE;
    } else if (mPos == 3) {
      ++mPos;
      return Z.FOUR;
    }
    while (!vowel(++mPos)) {
      // do nothing
    }
    mBuilder.append(French.SINGLETON.toRawText(mPos));
    //System.out.println(mBuilder.toString());
    return Z.valueOf(mPos);
  }
}

