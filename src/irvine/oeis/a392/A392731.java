package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392731 Start at first leftmost digit of n. Move clockwise d steps, where d is the value of the active digit. Erase the digit landed upon. The new "active" digit is the one immediately following the one just erased. Repeat until only one digit remains. a(n) is the last remaining digit.
 * @author Sean A. Irvine
 */
public class A392731 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    String s = String.valueOf(++mN);
    int pos = 0;
    while (s.length() > 1) {
      pos += (s.charAt(pos) - '0') % s.length();
      s = s.substring(0, pos) + s.substring(pos + 1);
    }
    return new Z(s);
  }
}
