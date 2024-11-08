package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A072955 Suburban numbers: without b, r, s or u.
 * @author Sean A. Irvine
 */
public class A072955 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = English.SINGLETON.toText(++mN);
      if (!s.contains("b") && !s.contains("r") && !s.contains("s") && !s.contains("u")) {
        return Z.valueOf(mN);
      }
    }
  }
}

