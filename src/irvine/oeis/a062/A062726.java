package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Roman;

/**
 * A062726 Numbers that do not contain repeated letters when written in Roman numerals.
 * @author Sean A. Irvine
 */
public class A062726 extends Sequence1 {

  private int mN = 0;

  private boolean is(final String s) {
    long syn = 0;
    for (int k = 0; k < s.length(); ++k) {
      final long bit = 1L << s.charAt(k) - 'A';
      if ((syn & bit) != 0) {
        return false;
      }
      syn |= bit;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1666) {
        return null;
      }
      if (is(Roman.roman(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
