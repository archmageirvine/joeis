package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051022 Interpolate 0's between each pair of digits of n.
 * @author Sean A. Irvine
 */
public class A051022 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final StringBuilder sb = new StringBuilder();
    sb.append(s.charAt(0));
    for (int k = 1; k < s.length(); ++k) {
      sb.append('0').append(s.charAt(k));
    }
    return new Z(sb);
  }
}
