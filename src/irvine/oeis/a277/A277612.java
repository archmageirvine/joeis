package irvine.oeis.a277;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a143.A143134;

/**
 * A277612 E.g.f. satisfies: A(x - sin(x)^2) = x + sin(x)^2.
 * @author Georg Fischer
 */
public class A277612 extends AbstractSequence {

  private int mN = 0;
  private final A143134 mSeq = new A143134();

  /** Construct the sequence. */
  public A277612() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.TWO.multiply(mSeq.next());
    return (mN == 1) ? Z.ONE : result;
  }
}
