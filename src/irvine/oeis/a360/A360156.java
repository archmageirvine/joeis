package irvine.oeis.a360;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a171.A171977;
import irvine.oeis.a192.A192066;

/**
 * A360156 a(n) is the sum of the even unitary divisors of 2*n.
 * @author Georg Fischer
 */
public class A360156 extends AbstractSequence {

  private final A171977 mSeq1 = new A171977();
  private final A192066 mSeq2 = new A192066();

  /** Construct the sequence. */
  public A360156() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
