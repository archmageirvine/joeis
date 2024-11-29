package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Roman;

/**
 * A073427 Roman numerals for n evaluated as if in Sallows' base 27.
 * @author Sean A. Irvine
 */
public class A073427 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final String s = Roman.roman(++mN);
    Z r = Z.ZERO;
    for (int k = 0; k < s.length(); ++k) {
      r = r.multiply(27).add(s.charAt(k) - '@');
    }
    return r;
  }
}

