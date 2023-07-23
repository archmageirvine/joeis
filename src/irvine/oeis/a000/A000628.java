package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;

/**
 * A000628 Number of n-node unrooted steric quartic trees; number of n-carbon alkanes C(n)H(2n+2) taking stereoisomers into account.
 * @author Sean A. Irvine
 */
public class A000628 extends A000625 {

  {
    setOffset(0);
  }

  private final ConvolutionSequence mCQ = new ConvolutionSequence(new A000625());
  private final ArrayList<Z> mQ = new ArrayList<>();
  private final ArrayList<Z> mA625 = new ArrayList<>();

  @Override
  public Z next() {
    mA625.add(super.next());
    mQ.add(mCQ.next());
    Z r = Z.ZERO;
    for (int j = 0; j < (mN + 2) / 3; ++j) {
      r = r.add(mA625.get(j).multiply(mA625.get(mN - 3 * j - 1)));
    }
    r = r.multiply2().add(mA625.get(mN).multiply(3).subtract(mQ.get(mN)));
    if ((mN & 1) == 0) {
      r = r.add(mA625.get(mN / 2).multiply2());
    } else {
      r = r.add(mQ.get(mN / 2));
    }
    return r.divide(4);
  }
}
