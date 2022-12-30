package irvine.oeis.a096;
// manually bisect at 2022-12-24 11:49

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A096967 Bisection of A096441.
 * @author Georg Fischer
 */
public class A096967 extends Sequence0 {

  private long mN = -1;
  private final A096441 mSeq = new A096441();

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    mSeq.next();
    return mSeq.next();
  }
}
