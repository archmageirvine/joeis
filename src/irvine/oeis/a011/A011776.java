package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011776 a(1) = 1; for n &gt; 1, a(n) is defined by the property that n^a(n) divides n! but n^(a(n)+1) does not.
 * @author Sean A. Irvine
 */
public class A011776 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long c = 0;
    mF = mF.multiply(mN);
    Z m = Z.valueOf(mN);
    do {
      m = m.multiply(mN);
      ++c;
    } while (mF.mod(m).isZero());
    return Z.valueOf(c);
  }
}
