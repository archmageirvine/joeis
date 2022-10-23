package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Roman;

/**
 * A002963 Number of chisel strokes required for Roman numerals for n.
 * @author Sean A. Irvine
 */
public class A002963 extends Sequence1 {

  private int mN = 0;

  private int strokes(final char c) {
    switch (c) {
      case 'I':
        return 1;
      case 'V':
      case 'L':
      case 'X':
      case 'C':
        return 2;
      case 'D':
        return 3;
      case 'M':
        return 4;
      default:
        throw new UnsupportedOperationException();
    }
  }

  private int strokes(final String s) {
    int sum = 0;
    for (int k = 0; k < s.length(); ++k) {
      sum += strokes(s.charAt(k));
    }
    return sum;
  }

  @Override
  public Z next() {
    return Z.valueOf(strokes(Roman.roman(++mN)));
  }
}
