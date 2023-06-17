package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001106 9-gonal (or enneagonal or nonagonal) numbers: a(n) = n*(7*n-5)/2.
 * @author Sean A. Irvine
 */
public class A001106 extends AbstractSequence {

  /* Construct the sequence. */
  public A001106() {
    super(0);
  }

  protected Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.multiply(7).subtract(5)).divide2();
  }
}

