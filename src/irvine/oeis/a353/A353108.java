package irvine.oeis.a353;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a058.A058241;

/**
 * A353108 a(n) is the number of cycles of n numbers arranged so that every integer in 1..n*(n-1)+1 occurs as the sum of up to n adjacent numbers. Both a solution and its reverse are counted unless they are identical.
 * @author Georg Fischer
 */
public class A353108 extends AbstractSequence {

  private int mN = 0;
  private final A058241 mSeq = new A058241();

  /** Construct the sequence. */
  public A353108() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.TWO.multiply(mSeq.next());
    return (mN <= 2) ? Z.ONE : result;
  }
}
