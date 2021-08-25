package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A051108 Numbers described with a single word in American English.
 * @author Sean A. Irvine
 */
public class A051108 implements Sequence {

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
