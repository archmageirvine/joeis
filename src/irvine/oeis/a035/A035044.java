package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035044 Exchange 2 and 3.
 * @author Sean A. Irvine
 */
public class A035044 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toString(++mN);
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < s.length(); ++k) {
      final int t = s.charAt(k) - '0';
      switch (t) {
        case 2:
          sb.append('3');
          break;
        case 3:
          sb.append('2');
          break;
        default:
          sb.append(t);
          break;
      }
    }
    return new Z(sb);
  }
}
