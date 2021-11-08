package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052383 Numbers without 1 as a digit.
 * @author Sean A. Irvine
 */
public class A052383 implements Sequence {

  private long mN = -1;

  protected int missingDigit() {
    return 1;
  }

  @Override
  public Z next() {
    long r = 0;
    final String s = Long.toString(++mN, 9);
    for (int k = 0; k < s.length(); ++k) {
      final int d = s.charAt(k) - '0';
      r *= 10;
      r += d >= missingDigit() ? d + 1 : d;
    }
    return Z.valueOf(r);
  }
}
