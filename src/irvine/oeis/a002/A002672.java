package irvine.oeis.a002;

import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002672 Denominators of central difference coefficients <code>M_{3}^(2n+1)</code>.
 * @author Sean A. Irvine
 */
public class A002672 extends MemoryFunction2<Integer, Q> implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  protected Q compute(final Integer k, final Integer q) {
    if (k.equals(q)) {
      return Q.ONE;
    }
    if (k == 0 || k > q || ((k + q) & 1) == 1) {
      return Q.ZERO;
    }
    if (k == 1 && (q & 1) == 1) {
      return new Q(Z.ONE, Z.ONE.shiftLeft(q - 1));
    }
    if (k == 2 && (q & 1) == 0) {
      return Q.ONE;
    }
    return get(k - 2, q - 2).add(get(k, q - 2).multiply(k * (long) k).divide(4));
  }

  protected Q bigM(final int k, final int q) {
    return get(k, q).multiply(mF.factorial(k)).divide(mF.factorial(q));
  }

  private int mN = 1;

  @Override
  public Z next() {
    mN += 2;
    return bigM(3, mN).den();
  }
}
