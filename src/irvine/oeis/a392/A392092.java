package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392092 a(n+1) = a(n) + 2*d(a(n)) if s(a(n)) &lt;= a(n), else 2*a(n) - s(a(n)), with a(1) = 2; d(k) is the number of divisors of k A000005 and s(k) is the aliquot sum of k A001065.
 * @author Sean A. Irvine
 */
public class A392092 extends Sequence1 {

  private final Z mFirst;
  private Z mA = null;

  protected A392092(final Z first) {
    mFirst = first;
  }

  /** Construct the sequence. */
  public A392092() {
    this(Z.TWO);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mFirst;
      return mA;
    }
    final Z aliquot = Functions.ALIQUOT.z(mA);
    mA = aliquot.compareTo(mA) <= 0
      ? mA.add(Functions.SIGMA0.z(mA).multiply2())
      : mA.multiply2().subtract(aliquot);
    return mA;
  }
}
