package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000114;

/**
 * A001766 Index of (the image of) the modular group Gamma(n) in PSL_2(Z).
 * @author Sean A. Irvine
 */
public class A001766 extends A000114 {

  /** Construct the sequence. */
  public A001766() {
    super(1);
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    } else {
      return super.next().multiply(mN);
    }
  }
}
