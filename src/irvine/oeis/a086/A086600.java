package irvine.oeis.a086;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000204;

/**
 * A086600 Number of primitive prime factors in the n-th Lucas number A000204(n).
 * @author Sean A. Irvine
 */
public class A086600 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private final Sequence mA = new A000204();

  @Override
  public Z next() {
    long cnt = 0;
    final FactorSequence fs = Jaguar.factor(mA.next());
    for (final Z p : fs.toZArray()) {
      if (mSeen.add(p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
