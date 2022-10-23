package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A058179 Numbers whose English names include all five vowels at least once.
 * @author Sean A. Irvine
 */
public class A058179 extends Sequence1 {

  private int mN = 104;

  @Override
  public Z next() {
    while (true) {
      final String s = English.SINGLETON.toText(++mN);
      if (s.contains("u") && s.contains("i") && s.contains("a") && s.contains("e") && s.contains("i")) {
        return Z.valueOf(mN);
      }
    }
  }
}
