package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083654 Consider the binary Champernowne sequence (A030190): number of successive numbers to be concatenated beginning with A083653(n) such that in binary representation n is contained.
 * @author Sean A. Irvine
 */
public class A083654 extends A083653 {

  @Override
  public Z next() {
    final long m = super.next().longValue();
    final String s = Long.toBinaryString(mN);
    final StringBuilder t = new StringBuilder();
    int k = -1;
    while (t.indexOf(s) < 0) {
      t.append(Long.toBinaryString(m + ++k));
    }
    return Z.valueOf(k + 1);
  }
}
