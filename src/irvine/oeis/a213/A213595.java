package irvine.oeis.a213;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a048.A048784;

/**
 * A213595 A048784(n) / 2^A213594(n).
 * @author Georg Fischer
 */
public class A213595 extends A048784 {

  private final Sequence mSeq = new A213594();

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(Z.ONE.shiftLeft(mSeq.next().intValue()));
  }
}
