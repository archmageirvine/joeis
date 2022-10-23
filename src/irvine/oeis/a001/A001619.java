package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A001619 Number of letters in English name for n increases at these numbers.
 * @author Sean A. Irvine
 */
public class A001619 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mLetterCount = 0;

  @Override
  public Z next() {
    while (true) {
      final String name = English.SINGLETON.toText(++mN);
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
