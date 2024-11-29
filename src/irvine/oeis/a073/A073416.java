package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A073416 Harmless numbers: numbers without a, h, m or r.
 * @author Sean A. Irvine
 */
public class A073416 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = English.SINGLETON.toRawText(++mN);
      if (!s.contains("h") && !s.contains("a") && !s.contains("r") && !s.contains("m")) {
        return Z.valueOf(mN);
      }
    }
  }
}

