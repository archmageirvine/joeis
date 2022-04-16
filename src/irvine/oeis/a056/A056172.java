package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;

/**
 * A056172 Number of non-unitary prime divisors of n!.
 * @author Sean A. Irvine
 */
public class A056172 extends A000720 {

  private final Sequence mSeq = new A056171();

  @Override
  public Z next() {
    return super.next().subtract(mSeq.next());
  }
}
