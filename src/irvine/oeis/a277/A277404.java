package irvine.oeis.a277;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a143.A143138;

/**
 * A277404 E.g.f. A(x) satisfies: A( x - (exp(x) - 1)^2 ) = x + (exp(x) - 1)^2.
 * @author Georg Fischer
 */
public class A277404 extends AbstractSequence {

  private int mN = 0;
  private final A143138 mSeq = new A143138();

  /** Construct the sequence. */
  public A277404() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.TWO.multiply(mSeq.next());
    return (mN == 1) ? Z.ONE : result;
  }
}
