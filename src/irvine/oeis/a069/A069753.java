package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069753 Smallest k&gt;n such that the tetrahedral number n*(n+1)*(n+2)/6 divides the tetrahedral number k*(k+1)*(k+2)/6.
 * @author Sean A. Irvine
 */
public class A069753 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z tn = Functions.TETRAHEDRAL.z(++mN);
    long k = mN;
    while (true) {
      final Z tk = Functions.TETRAHEDRAL.z(++k);
      if (tk.mod(tn).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
