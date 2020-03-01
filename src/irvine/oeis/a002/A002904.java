package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;
import irvine.util.string.Roman;

/**
 * A002904 Delete all letters except c, d, i, l, m, v, x from the English name of n, then read as Roman numeral if possible, otherwise 0.
 * @author Sean A. Irvine
 */
public class A002904 implements Sequence {

  // Sequence is ambiguous from 35 -> IIV onwards.  You get what you get :-)

  private int mN = 0;

  @Override
  public Z next() {
    final String english = English.SINGLETON.toText(++mN);
    final StringBuilder roman = new StringBuilder();
    for (int k = 0; k < english.length(); ++k) {
      final char c = english.charAt(k);
      if ("cdilmvx".indexOf(c) != -1) {
        roman.append(c);
      }
    }
    if (roman.length() == 0) {
      return Z.ZERO;
    }
    try {
      return Z.valueOf(Roman.parse(roman.toString()));
    } catch (final IllegalArgumentException e) {
      return Z.ZERO;
    }
  }
}
