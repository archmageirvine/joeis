package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056484 Number of primitive (aperiodic) palindromic structures using exactly five different symbols.
 * @author Georg Fischer
 */
public class A056484 extends A056478 {

  private final Sequence mSeq = new A056479();

  {
    next();
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(super.next());
  }
}
