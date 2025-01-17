package irvine.oeis.a074;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001599;

/**
 * A074244 Numbers k such that phi(k) is a harmonic number.
 * @author Sean A. Irvine
 */
public class A074244 extends Sequence1 {

  private final Sequence mHarmonic = new A001599();
  private final TreeSet<Z> mH = new TreeSet<>();
  {
    mH.add(mHarmonic.next());
  }
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Functions.PHI.z(++mN);
      while (phi.compareTo(mH.last()) > 0) {
        mH.add(mHarmonic.next());
      }
      if (mH.contains(phi)) {
        return Z.valueOf(mN);
      }
    }
  }
}
