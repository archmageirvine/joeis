package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A073417 Flawless numbers: numbers without a, f, l or w.
 * @author Sean A. Irvine
 */
public class A073417 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String s = English.SINGLETON.toRawText(++mN);
      if (!s.contains("f") && !s.contains("l") && !s.contains("a") && !s.contains("w")) {
        return Z.valueOf(mN);
      }
    }
  }
}

