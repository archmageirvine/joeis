package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066248 a(n) = if n+1 is prime then A049084(n+1)*2 else A066246(n+1)*2 - 1.
 * @author Sean A. Irvine
 */
public class A066248 extends A000040 {

  private long mP = super.next().longValueExact();
  private long mM = 0;
  private long mN = 1;
  private long mC = -1;

  @Override
  public Z next() {
    if (++mN == mP) {
      mP = super.next().longValueExact();
      mM += 2;
      return Z.valueOf(mM);
    }
    mC += 2;
    return Z.valueOf(mC);
  }
}
