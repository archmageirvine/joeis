package irvine.oeis.a272;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000129;

/**
 * A272040 a(n) = A000010(A000129(n)).
 * @author Georg Fischer
 */
public class A272040 extends AbstractSequence {

  private final A000129 mSeq1 = new A000129();

  /** Construct the sequence. */
  public A272040() {
    super(1);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return Euler.phi(mSeq1.next());
  }
}
