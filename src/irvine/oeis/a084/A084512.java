package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084512 Successively larger 3-ball indecomposable ground-state site swaps of A084511 in concatenated decimal notation.
 * @author Sean A. Irvine
 */
public class A084512 extends A084511 {

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
