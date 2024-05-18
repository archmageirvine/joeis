package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069743.
 * @author Sean A. Irvine
 */
public class A069752 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z trn = Functions.TRIANGULAR.z(++mN);
    long k = mN;
    while (true) {
      final Z trk = Functions.TRIANGULAR.z(++k);
      if (trk.mod(trn).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
