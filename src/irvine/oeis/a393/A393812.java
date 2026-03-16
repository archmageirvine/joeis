package irvine.oeis.a393;

import java.util.Set;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393812 Irregular triangle read by rows; integers with identical sigma values occurring at least twice, rows ordered by their smallest term.
 * @author Sean A. Irvine
 */
public class A393812 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.FIVE;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mN = mN.add(1);
      final Set<Z> s = InverseSigma.inverseSigma(Functions.SIGMA1.z(mN), 1);
      if (s.size() > 1) {
        mA.addAll(s);
        if (!mA.first().equals(mN)) {
          mA.clear();
        }
      }
    }
    return mA.pollFirst();
  }
}
