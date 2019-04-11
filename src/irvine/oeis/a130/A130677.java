package irvine.oeis.a130;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A130677 Write the English name of <code>2^n</code> and replace each letter with its rank in the alphabet.
 * @author Sean A. Irvine
 */
public class A130677 implements Sequence {

  private int mN = 1;
  private String mS = "";
  private int mPos = 0;

  @Override
  public Z next() {
    if (mPos >= mS.length()) {
      mS = English.toRawEnglish(mN);
      mN <<= 1;
      mPos = 0;
    }
    return Z.valueOf(mS.charAt(mPos++) - 'a' + 1);
  }
}

