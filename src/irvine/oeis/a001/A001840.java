package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001840 Expansion of g.f. x/((1 - x)^2*(1 - x^3)).
 * @author Sean A. Irvine
 */
public class A001840 extends AbstractSequence {

  /** Construct the sequence. */
  public A001840() {
    super(0);
  }

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN + mN % 3).multiply(mN / 3 + 1).divide2();
  }
}
