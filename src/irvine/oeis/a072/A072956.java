package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A072956 Turban numbers: without letters r, t, or u.
 * @author Sean A. Irvine
 */
public class A072956 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = English.SINGLETON.toText(++mN);
      if (!s.contains("r") && !s.contains("t") && !s.contains("u")) {
        return Z.valueOf(mN);
      }
    }
  }
}

