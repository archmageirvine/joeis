package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000595;

/**
 * A001377 Number of relations with 4 arguments on n nodes.
 * @author Sean A. Irvine
 */
public class A001377 extends A000595 {

  /** Construct the sequence. */
  public A001377() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  protected int t(final int[] s) {
    int sum = 0;
    for (int i = 1; i < s.length; ++i) {
      for (int j = 1; j < s.length; ++j) {
        final int ij = i * j;
        final int lij = Functions.LCM.i(i, j);
        for (int k = 1; k < s.length; ++k) {
          final int ijk = ij * k;
          final int lijk = Functions.LCM.i(lij, k);
          for (int l = 1; l < s.length; ++l) {
            final int lcm = Functions.LCM.i(lijk, l);
            sum += (ijk * l / lcm) * s[i] * s[j] * s[k] * s[l];
          }
        }
      }
    }
    return sum;
  }
}
