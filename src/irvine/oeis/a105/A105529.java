package irvine.oeis.a105;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A105529 Given a list of ternary numbers, interpret each as a ternary Gray code number, then convert to decimal.
 * @author Sean A. Irvine
 */
public class A105529 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String n = Long.toString(++mN, 3);
    final StringBuilder sb = new StringBuilder();
    for (int k = 0, v = 0; k < n.length(); ++k) {
      v += n.charAt(k) - '0';
      v %= 3;
      sb.append(v);
    }
    return new Z(sb, 3);
  }
}

