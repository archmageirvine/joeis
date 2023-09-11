package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065751.
 * @author Sean A. Irvine
 */
public class A065751 extends Sequence0 {

  private long mN = 17;

  private boolean is(final String s) {
    if (s.equals("09")
      || s.equals("18")
      || s.equals("27")
      || s.equals("36")
      || s.equals("45")
      || (s.startsWith("1") && s.endsWith("8") && is(s.substring(1, s.length() - 1)))
      || (s.startsWith("2") && s.endsWith("7") && is(s.substring(1, s.length() - 1)))
      || (s.startsWith("3") && s.endsWith("6") && is(s.substring(1, s.length() - 1)))
      || (s.startsWith("4") && s.endsWith("5") && is(s.substring(1, s.length() - 1)))
      || (s.startsWith("18") && is(s.substring(2)))
      || (s.startsWith("27") && is(s.substring(2)))
      || (s.startsWith("36") && is(s.substring(2)))
      || (s.startsWith("45") && is(s.substring(2)))
    ) {
      return true;
    }
    for (int k = 2; k < s.length(); k += 2) {
      if (is(s.substring(0, k)) && is(s.substring(k))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(String.valueOf(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
