package irvine.oeis.a351;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a051.A051953;

/**
 * A351561 a(n) = n + d(n) - phi(n), where d is the number of divisors function, and phi is the Euler totient function.
 * @author Georg Fischer
 */
public class A351561 extends AbstractSequence {

  private A000005 mSeq1 = new A000005();
  private A051953 mSeq2 = new A051953();

  /** Construct the sequence. */
  public A351561() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
