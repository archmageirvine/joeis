package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A072959 Using the US English names for the nonnegative integers, assign each letter a numerical value as in A073327 (A=1, B=2, ..., Z=26), treat the name as a base-27 integer, and convert to decimal.
 * @author Sean A. Irvine
 */
public class A072959 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final String s = English.SINGLETON.toRawText(++mN);
    Z res = Z.ZERO;
    for (int k = 0; k < s.length(); ++k) {
      res = res.multiply(27).add(s.charAt(k) - '`');
    }
    return res;
  }
}

