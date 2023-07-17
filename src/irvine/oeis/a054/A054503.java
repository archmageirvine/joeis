package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a001.A001918;

/**
 * A054503 Table T(n,k) giving log_b(k), 1&lt;=k&lt;=p, where p = n-th prime and b = smallest primitive root of p (A001918).
 * @author Sean A. Irvine
 */
public class A054503 extends A001918 {

  /** Construct the sequence. */
  public A054503() {
    super(0);
  }

  private Z mB = null;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mM = mM.add(1);
    if (mM.compareTo(mP) >= 0) {
      mB = super.next();
      mM = Z.ONE;
    }
    long lg = 0;
    Z t = Z.ONE;
    while (!t.equals(mM)) {
      t = t.modMultiply(mB, mP);
      ++lg;
    }
    return Z.valueOf(lg);
  }
}
