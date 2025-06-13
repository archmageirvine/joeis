package irvine.oeis.a074;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001599;

/**
 * A074245 Numbers k such that sigma(k) is a harmonic number.
 * @author Sean A. Irvine
 */
public class A074245 extends Sequence1 {

  private final Sequence mHarmonic = new A001599();
  private final TreeSet<Z> mH = new TreeSet<>();
  {
    mH.add(mHarmonic.next());
  }
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Functions.SIGMA1.z(++mN);
      while (sigma.compareTo(mH.last()) > 0) {
        mH.add(mHarmonic.next());
      }
      if (mH.contains(sigma)) {
        return Z.valueOf(mN);
      }
    }
  }
}
