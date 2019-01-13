package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.French;
import irvine.util.string.Roman;

/**
 * A014287.
 * @author Sean A. Irvine
 */
public class A014287 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final String french = French.toFrench(++mN).replace('u', 'v');
    final StringBuilder roman = new StringBuilder();
    for (int k = 0; k < french.length(); ++k) {
      final char c = french.charAt(k);
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
