package irvine.oeis.a229;
// manually simple3 at 2023-03-24 09:26

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007080;

/**
 * A229865 Number of n X n 0..1 arrays with corresponding row and column sums equal.
 * @author Georg Fischer
 */
public class A229865 extends AbstractSequence {

  private int mN = -1;
  private final A007080 mSeq = new A007080();

  /** Construct the sequence. */
  public A229865() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : Z.ONE.shiftLeft(mN).multiply(mSeq.next());
  }
}
