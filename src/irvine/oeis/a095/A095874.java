package irvine.oeis.a095;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a065.A065515;
import irvine.oeis.a069.A069513;

/**
 * A095874 a(n) = k if n = A000961(k) (powers of primes), a(n) = 0 if n is not in A000961.
 * @author Georg Fischer
 */
public class A095874 extends AbstractSequence {

  private int mN = 0;
  private A065515 mSeq1 = new A065515();
  private A069513 mSeq2 = new A069513();

  /** Construct the sequence. */
  public A095874() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().multiply(mSeq2.next());
    return (mN == 1) ? Z.ONE : result;
  }
}
