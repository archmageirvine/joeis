package irvine.oeis.a262;
// manually anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a039.A039716;
import irvine.oeis.a062.A062439;

/**
 * A262398 a(n) = prime(n)! mod prime(n!).
 * @author Georg Fischer
 */
public class A262398 extends AbstractSequence {

  private final A039716 mSeq1 = new A039716();
  private final A062439 mSeq2 = new A062439();

  /** Construct the sequence. */
  public A262398() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().mod(mSeq2.next());
  }
}
