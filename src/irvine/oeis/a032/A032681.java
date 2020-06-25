package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A032681 Digit <code>'9'</code> concatenated with <code>a(n)</code> is a lucky number.
 * @author Sean A. Irvine
 */
public class A032681 extends A000959 {

  @Override
  public Z next() {
    while (true) {
      final String l = super.next().toString();
      if (l.length() > 1 && l.charAt(0) == '9' && l.charAt(1) != '0') {
        return new Z(l.substring(1));
      }
    }
  }
}
