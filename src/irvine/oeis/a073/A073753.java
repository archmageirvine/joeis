package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A073753 a(n) = A073752(A073752(n)), where A073752(n) = gcd(n/spf(n), n/gpf(n)), with spf(n) as the smallest and gpf(n) as the greatest prime factor of n (see A020639, A006530).
 * @author Sean A. Irvine
 */
public class A073753 extends Sequence1 {

  private final DirectSequence mSeq = DirectSequence.create(new A073752());
  private int mN = 0;

  @Override
  public Z next() {
    return mSeq.a(mSeq.a(++mN));
  }
}
