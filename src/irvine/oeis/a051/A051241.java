package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000595;

/**
 * A051241 Number of relations with 5 arguments on n nodes.
 * @author Sean A. Irvine
 */
public class A051241 extends A000595 {

  /** Construct the sequence. */
  public A051241() {
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
            final int ijkl = ijk * l;
            final int lijkl = Functions.LCM.i(lijk, l);
            for (int m = 1; m < s.length; ++m) {
              final int lcm = Functions.LCM.i(lijkl, m);
              sum += (ijkl * m / lcm) * s[i] * s[j] * s[k] * s[l] * s[m];
            }
          }
        }
      }
    }
    return sum;
  }
}
