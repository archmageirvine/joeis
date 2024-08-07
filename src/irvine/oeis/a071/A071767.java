package irvine.oeis.a071;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001599;

/**
 * A071767 Numbers n such that sigma(n) and d(n) are both harmonic (Ore) numbers.
 * @author Sean A. Irvine
 */
public class A071767 extends Sequence1 {

  private final TreeSet<Z> mOre = new TreeSet<>();
  private final Sequence mA = new A001599();
  private long mN = 0;

  private boolean isOre(final Z n) {
    while (mOre.isEmpty() || n.compareTo(mOre.last()) > 0) {
      mOre.add(mA.next());
    }
    return mOre.contains(n);
  }

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (isOre(fs.sigma0()) && isOre(fs.sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
