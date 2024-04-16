package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A066103 Smallest m such that A001221(A001159(m)) = n.
 * @author Sean A. Irvine
 */
public class A066103 extends Sequence1 {

  private int mN = 0;
  private long mM = 0;
  private final DynamicLongArray mA = new DynamicLongArray();

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      final int omega = Functions.OMEGA.i(Jaguar.factor(++mM).sigma(4));
      if (mA.get(omega) == 0) {
        mA.set(omega, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
