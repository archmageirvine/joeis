package irvine.oeis.a244;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000108;

/**
 * A244746 Numbers obtained by concatenating the squares of the digits of Catalan(n).
 * @author Sean A. Irvine
 */
public class A244746 extends Sequence0 {

  private final Sequence mF = new A000108();

  @Override
  public Z next() {
    final String f = mF.next().toString();
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < f.length(); ++k) {
      final int t = f.charAt(k) - '0';
      sb.append(t * t);
    }
    return new Z(sb);
  }
}
