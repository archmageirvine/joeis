package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a056.A056525;

/**
 * A082945 Numbers n which in decimal have the form imj, where m is the middle digit, with property that j is the reversal of i, and i = m*j.
 * @author Sean A. Irvine
 */
public class A082945 extends Sequence1 {

  private final Sequence mPalins = new A056525().skip(10);

  @Override
  public Z next() {
    while (true) {
      final Z p = mPalins.next();
      final String s = p.toString();
      final char mid = s.charAt(s.length() / 2);
      if (mid == '0') {
        continue;
      }
      if (s.charAt(s.length() / 2 - 1) == '0') {
        continue;
      }
      final Z left = new Z(s.substring(0, s.length() / 2));
      if (left.equals(new Z(s.substring(s.length() / 2 + 1)).multiply(mid - '0'))) {
        return p;
      }
    }
  }
}
