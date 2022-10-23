package irvine.oeis.a247;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A247891 a(n) is Gray-coded in base 4 into n.
 * @author Georg Fischer
 */
public class A247891 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String n = Long.toString(++mN, 4);
    final StringBuilder sb = new StringBuilder();
    for (int k = 0, v = 0; k < n.length(); ++k) {
      v += n.charAt(k) - '0';
      v %= 4;
      sb.append(v);
    }
    return new Z(sb, 4);
  }
}

