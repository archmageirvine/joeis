package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000292;
import irvine.oeis.a000.A000580;

/**
 * A059251 A sequence related to numeric partitions and Fermat Coefficients.
 * @author Sean A. Irvine
 */
public class A059251 extends A000580 {

  private final Sequence mM2 = new A000292(); // C(n,3)
  private final Sequence mM4 = new A000027(); // C(n,1)
  private int mN = -1;
  {
    mM2.next();
  }

  @Override
  public Z next() {
    Z t = super.next();
    if ((++mN & 1) == 0) {
      t = t.add(mM2.next());
    }
    if ((mN & 3) == 0) {
      t = t.add(mM4.next().multiply(6));
    }
    return t.divide(8);
  }
}

