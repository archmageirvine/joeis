package irvine.oeis.a054;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.QuadraticCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054464 Numbers n such that Sum_{k=1..n} d(k) is an integer where d(k) is the decimal fraction 0.k (e.g. d(999)=0.999).
 * @author Sean A. Irvine
 */
public class A054464 extends Sequence1 {

  private final List<Z> mA = new ArrayList<>();
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
      final Z mod = t10.multiply2();
      final Z c = tens.modMultiply(9L * mN + 1, mod);
      for (final Z s : QuadraticCongruence.solve(Z.ONE, Z.ONE, mod.subtract(c), mod)) {
        if (s.compareTo(tens) >= 0 && s.compareTo(t10) < 0) {
          mA.add(s);
        }
      }
    }
    return mA.get(mM);
  }
}
