package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084502 Successively larger 3-ball ground-state site swaps of A084501 in concatenated decimal notation.
 * @author Sean A. Irvine
 */
public class A084502 extends A084501 {

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
