package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A051107 Numbers described with a single word in British English.
 * @author Sean A. Irvine
 */
public class A051107 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      // We get "one hundred" rather than "hundred"
      final String s = English.SINGLETON.toText(++mN).replaceAll("^one ", "");
      if (!s.contains(" ") && !s.contains("-")) {
        return Z.valueOf(mN);
      }
    }
  }
}
