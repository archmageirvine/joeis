package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001350 Associated Mersenne numbers.
 * @author Sean A. Irvine
 */
public class A001350 extends AbstractSequence {

  /* Construct the sequence. */
  public A001350() {
    super(0);
  }

  private Z mA = Z.ONE;
  private Z mB = Z.NEG_ONE;
  private int mSign = -1;

  @Override
  public Z next() {
    mSign = -mSign;
    final Z t = mA.add(mB).add(1 - mSign);
    mA = mB;
    mB = t;
    return t;
  }
}
