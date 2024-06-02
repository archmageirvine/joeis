package irvine.oeis.a070;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070175 The smallest representative of each (bigomega(n),omega(n)) pair.
 * @author Sean A. Irvine
 */
public class A070175 extends Sequence1 {

  private final HashSet<String> mSeen = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (mSeen.add(String.valueOf(fs.omega()) + fs.bigOmega())) {
        return Z.valueOf(mN);
      }
    }
  }
}
