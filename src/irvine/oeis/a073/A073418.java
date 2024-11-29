package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A073418 Useless numbers: numbers written in English without any of the letters e, s or u.
 * @author Sean A. Irvine
 */
public class A073418 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = English.SINGLETON.toRawText(++mN);
      if (!s.contains("u") && !s.contains("s") && !s.contains("e")) {
        return Z.valueOf(mN);
      }
    }
  }
}

