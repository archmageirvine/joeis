package irvine.oeis.a145;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a008.A008328;
import irvine.oeis.a008.A008329;

/**
 * A145337 a(n) = d(p(n)+1) - d(p(n)-1), where d(m) = the number of divisors of m, p(n) = the n-th prime.
 * @author Georg Fischer
 */
public class A145337 extends AbstractSequence {

  private final A008329 mSeq1 = new A008329();
  private final A008328 mSeq2 = new A008328();

  /** Construct the sequence. */
  public A145337() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
