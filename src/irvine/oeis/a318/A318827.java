package irvine.oeis.a318;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a051.A051953;

/**
 * A318827 a(n) = n - gcd(n - 1, phi(n)).
 * @author Georg Fischer
 */
public class A318827 extends AbstractSequence {

  private final A051953 mSeq1 = new A051953();
  private final A318830 mSeq2 = new A318830();

  /** Construct the sequence. */
  public A318827() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
