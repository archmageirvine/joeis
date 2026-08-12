package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080063 a(n) = n mod (lpf(n)+1), where lpf(n) is the least prime dividing n (A020639).
 * @author Sean A. Irvine
 */
public class A080063 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN % (Functions.LPF.l(mN) + 1));
  }
}
