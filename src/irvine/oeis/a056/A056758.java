package irvine.oeis.a056;
// manually 2021-01-20

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056758 Numbers n for which d(n)^3 &lt; n.
 * @author Georg Fischer
 */
public class A056758 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    Z n  = Z.valueOf(++mN);
    Z dn = Functions.SIGMA0.z(mN);
    while (dn.pow(3).compareTo(n) >= 0) {
      n  = Z.valueOf(++mN);
      dn = Functions.SIGMA0.z(mN);
    }
    return n;
  }
}
