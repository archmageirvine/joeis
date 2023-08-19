package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065157 Table of binary string substitutions: a(i,j) is obtained by substituting i for each 1-bit in j.
 * @author Sean A. Irvine
 */
public class A065157 extends Sequence1 {

  protected long mN = 0;
  protected long mM = 0;

  protected Z t(final long n, final long m) {
    final String s = Long.toBinaryString(n);
    final String t = Long.toBinaryString(m);
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) == '0') {
        sb.append('0');
      } else {
        sb.append(t);
      }
    }
    return new Z(sb, 2);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM);
  }
}

