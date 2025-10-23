package irvine.oeis.a255;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a048.A048050;
import irvine.oeis.a129.A129979;

/**
 * A255369 a(n) = (sigma(n)-n-1)*(2-mu(n)), where sigma(n) is the sum of the divisors of n and mu(n) is the M\u00f6bius function.
 * @author Georg Fischer
 */
public class A255369 extends AbstractSequence {

  private int mN = 0;
  private final A048050 mSeq1 = new A048050();
  private final A129979 mSeq2 = new A129979();

  /** Construct the sequence. */
  public A255369() {
    super(1);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().multiply(mSeq2.next());
    return (++mN == 1) ? Z.NEG_ONE : result;
  }
}
