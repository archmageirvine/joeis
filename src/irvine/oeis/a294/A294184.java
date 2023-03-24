package irvine.oeis.a294;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a051.A051252;

/**
 * A294184 a(n) is the number of ways to arrange numbers from 1 to 2*n in a row, starting with 1, such that the sum of every two adjacent numbers is prime, but also considering the ends as adjacent.
 * @author Georg Fischer
 */
public class A294184 extends AbstractSequence {

  private int mN = 0;
  private final A051252 mSeq = new A051252();

  /** Construct the sequence. */
  public A294184() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.TWO.multiply(mSeq.next());
    return (mN == 1) ? Z.ONE : result;
  }
}
