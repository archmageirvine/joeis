package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a054.A054040;

/**
 * A082915 Numbers n for which the first difference sequence of A054040 decreases.
 * @author Sean A. Irvine
 */
public class A082915 extends Sequence1 {

  private final Sequence mA = new DifferenceSequence(new A054040());
  private Z mD = mA.next();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mD;
      mD = mA.next();
      if (mD.compareTo(t) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
