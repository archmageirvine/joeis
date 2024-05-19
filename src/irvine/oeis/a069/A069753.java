package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069743.
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
