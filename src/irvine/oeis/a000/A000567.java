package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000567 Octagonal numbers: n*(3*n-2). Also called star numbers.
 * @author Sean A. Irvine
 */
public class A000567 extends AbstractSequence {

  /** Construct the sequence. */
  public A000567() {
    super(0);
  }

  protected Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(3).subtract(2).multiply(mN);
  }
}

