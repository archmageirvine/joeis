package irvine.oeis.a226;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A226134 The partial digital sums of n from left to right mod 10 give the digits of a(n).
 * @author Georg Fischer
 */
public class A226134 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String n = Long.toString(++mN, 10);
    final StringBuilder sb = new StringBuilder();
    for (int k = 0, v = 0; k < n.length(); ++k) {
      v += n.charAt(k) - '0';
      v %= 10;
      sb.append(v);
    }
    return new Z(sb, 10);
  }
}

