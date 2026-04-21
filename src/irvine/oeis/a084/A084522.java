package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084522 Successively larger 3-ball 'prime' ground-state site swaps of A084521 in concatenated decimal notation.
 * @author Sean A. Irvine
 */
public class A084522 extends A084521 {

  private int mN = 0;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    for (final int v : mS.belgthor(++mN)) {
      sb.append(v);
    }
    return new Z(sb);
  }
}
