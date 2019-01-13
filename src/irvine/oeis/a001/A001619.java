package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A001619.
 * @author Sean A. Irvine
 */
public class A001619 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mLetterCount = 0;

  @Override
  public Z next() {
    while (true) {
      final String name = English.toEnglish(++mN);
      final int len = name.replace(" ", "").length();
      if (len > mLetterCount) {
        mLetterCount = len;
        if (mVerbose) {
          System.out.println(mLetterCount + " " + mN + " " + name);
        }
        return Z.valueOf(mN);
      }
    }
  }
}
