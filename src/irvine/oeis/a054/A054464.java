package irvine.oeis.a054;

import java.util.ArrayList;

import irvine.math.z.QuadraticCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054464 Numbers n such that Sum_{k=1..n} d(k) is an integer where d(k) is the decimal fraction 0.k (e.g. d(999)=0.999).
 * @author Sean A. Irvine
 */
public class A054464 implements Sequence {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (mN >= 0) { // temp should be == 0
      ++mN;
      return Z.FOUR;
    }
    if (++mM > mA.size()) { // todo while?
      ++mN;
      mM = 0;
      final Z tens = Z.TEN.pow(mN);
      final Z t = tens.multiply(9L * ++mN + 1);
      mA.addAll(QuadraticCongruence.solve(Z.ONE, Z.ONE, t.negate(), tens.multiply(20), mN)); // todo handle powers of 2
    }
    return mA.get(mM);
  }
}

/*
For d >=2, the m with d digits are the solutions of x^2 + x - 9*10^(d-1)*d - 10^(d-1) == 0 (mod 2*10^d) with 10^(d-1) <= x < 10^d. - Robert Israel, Aug 08 2016
 */
