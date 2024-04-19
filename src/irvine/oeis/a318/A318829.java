package irvine.oeis.a318;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a049.A049559;
import irvine.oeis.a063.A063994;

/**
 * A318829 a(n) = A063994(n) / A049559(n) = (1/gcd(n-1, phi(n))) * Product_{primes p dividing n} gcd(p-1, n-1).
 * @author Georg Fischer
 */
public class A318829 extends AbstractSequence {

  private final A063994 mSeq1 = new A063994();
  private final A049559 mSeq2 = new A049559();

  /** Construct the sequence. */
  public A318829() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
