package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A066246 a(n) = 0 unless n is a composite number A002808(k) then a(n) = k.
 * @author Sean A. Irvine
 */
public class A066246 extends A002808 {

  private long mC = super.next().longValueExact();
  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mC) {
      mC = super.next().longValueExact();
      return Z.valueOf(++mM);
    }
    return Z.ZERO;
  }
}
