package irvine.oeis.a054;

import java.util.ArrayList;

import irvine.math.z.QuadraticCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054465 Numbers k such that Sum_{j=1..k} d(j) is an integer where d(j) is the decimal fraction 0.2j (e.g., d(14) = 0.28).
 * @author Sean A. Irvine
 */
public class A054465 implements Sequence {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.FOUR;
    }
    ++mM;
    while (mM >= mA.size()) {
      ++mN;
      mM = 0;
      mA.clear();
      final Z tens = Z.TEN.pow(mN - 1);
      final Z t10 = tens.multiply(10);
      final Z c = t10.add(8 - 18L * mN).multiply(t10).divide(40);
      final Z lo = tens.divide2();
      final Z hi = t10.divide2();
      for (final Z s : QuadraticCongruence.solve(Z.ONE, Z.ONE, c, t10)) {
        if (s.compareTo(lo) >= 0 && s.compareTo(hi) < 0) {
          mA.add(s);
        }
      }
    }
    return mA.get(mM);
  }
}
