package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056485 Number of primitive (aperiodic) palindromic structures using exactly six different symbols.
 * @author Georg Fischer
 */
public class A056485 extends A056479 {

  private final Sequence mSeq = new A056480();

  {
    next();
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(super.next());
  }
}
