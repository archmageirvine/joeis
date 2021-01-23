package irvine.oeis.a056;
// manually 2021-01-20

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056758 Numbers n for which d(n)^3 &lt; n.
 * @author Georg Fischer
 */
public class A056758 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    Z n  = Z.valueOf(++mN);
    Z dn = Cheetah.factor(mN).sigma0();
    while (dn.pow(3).compareTo(n) >= 0) {
      n  = Z.valueOf(++mN);
      dn = Cheetah.factor(mN).sigma0();
    }
    return n;
  }
}
