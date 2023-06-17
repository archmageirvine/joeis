package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001792 a(n) = (n+2)*2^(n-1).
 * @author Sean A. Irvine
 */
public class A001792 extends AbstractSequence {

  /** Construct the sequence. */
  public A001792() {
    super(0);
  }

  private int mN = -2;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 3).shiftLeft(mN);
  }
}
