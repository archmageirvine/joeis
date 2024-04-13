package irvine.oeis.a336;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A336826 Bogot\u00e1 numbers: numbers k such that k = m*p(m) where p(m) is the digital product of m.
 * @author Sean A. Irvine
 */
public class A336826 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN) > 0) {
      final Z t = mN.multiply(Functions.DIGIT_PRODUCT.z(mN));
      if (t.compareTo(mN) >= 0) {
        mA.add(t);
      }
      mN = mN.add(1);
    }
    return mA.pollFirst();
  }
}
