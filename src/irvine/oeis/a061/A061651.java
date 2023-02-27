package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061651 Numbers with all even digits in which each nonzero digit divides the number formed by the rest, i.e., the number obtained by just removing this digit. 0 is divisible by every number.
 * @author Sean A. Irvine
 */
public class A061651 extends Sequence0 {

  private long mN = -1;

  private boolean is(final String s) {
    if (s.length() > 1) {
      for (int k = 0; k < s.length(); ++k) {
        final int d = s.charAt(k) - '0';
        if (d != 0 && Long.parseLong(s.substring(0, k) + s.substring(k + 1)) % d != 0) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 5).replace('4', '8').replace('3', '6').replace('2', '4').replace('1', '2');
      if (is(s)) {
        return new Z(s);
      }
    }
  }
}

