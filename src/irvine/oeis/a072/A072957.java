package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A072957 Urban numbers: without 'r' or 'u'.
 * @author Sean A. Irvine
 */
public class A072957 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = English.SINGLETON.toText(++mN);
      if (!s.contains("r") && !s.contains("u")) {
        return Z.valueOf(mN);
      }
    }
  }
}

