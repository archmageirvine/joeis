package irvine.oeis.a071;
// manually nopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000984;

/**
 * A071416 a(n) = gcd(n, binomial(2*n, n)).
 * @author Georg Fischer
 */
public class A071416 extends AbstractSequence {

  private int mN;
  private final A000984 mSeq1 = new A000984();

  /** Construct the sequence. */
  public A071416() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).gcd(mSeq1.next());
  }
}
