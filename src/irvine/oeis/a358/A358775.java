package irvine.oeis.a358;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a065.A065043;
import irvine.oeis.a353.A353374;

/**
 * A358775 a(n) = 1 if the prime factorization of n has an even number of prime factors that sum to an odd number, otherwise 0.
 * @author Georg Fischer
 */
public class A358775 extends AbstractSequence {

  private A065043 mSeq1 = new A065043();
  private A353374 mSeq2 = new A353374();

  /** Construct the sequence. */
  public A358775() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
