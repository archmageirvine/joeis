package irvine.oeis.a037;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A037941 Trajectory of 48 under prime factor concatenation procedure.
 * @author Sean A. Irvine
 */
public class A037941 extends Sequence0 {

  // This is annoying because it wants the terms broken out
  private HomePrimeSequence mHomePrimeSequence = null;
  private final List<Z> mA = new ArrayList<>();
  private int mM = 0;

  @Override
  public Z next() {
    if (mHomePrimeSequence == null) {
      mHomePrimeSequence = new HomePrimeSequence(48);
      return Z.valueOf(48);
    }
    if (mM >= mA.size()) {
      mM = 0;
      mA.clear();
      final Z t = mHomePrimeSequence.next();
      if (t == null) {
        return null;
      }
      final FactorSequence fs = Jaguar.factor(t);
      for (final Z p : fs.toZArray()) {
        for (int k = 0; k < fs.getExponent(p); ++k) {
          mA.add(p);
        }
      }
    }
    return mA.get(mM++);
  }
}

