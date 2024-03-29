package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A067119 a(n) = floor[X/Y] where X = concatenation of first n even numbers in increasing order and Y = n-th triangular number.
 * @author Sean A. Irvine
 */
public class A067119 extends Sequence1 {

  private long mN = 0;
  private final Sequence mT = new A000217().skip();
  private final StringBuilder mX = new StringBuilder();

  @Override
  public Z next() {
    mN += 2;
    mX.append(mN);
    return new Z(mX).divide(mT.next());
  }
}
