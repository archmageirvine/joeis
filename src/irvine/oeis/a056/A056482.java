package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056482 Number of primitive (aperiodic) palindromic structures using exactly three different symbols.
 * @author Georg Fischer
 */
public class A056482 extends A056476 {

  private final Sequence mSeq = new A056477();

  {
    next();
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(super.next());
  }
}
