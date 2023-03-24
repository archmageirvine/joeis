package irvine.oeis.a350;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a024.A024362;

/**
 * A350872 Number of coincidence site lattices of index n in square lattice.
 * @author Georg Fischer
 */
public class A350872 extends AbstractSequence {

  private int mN = 0;
  private final A024362 mSeq = new A024362();

  /** Construct the sequence. */
  public A350872() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.TWO.multiply(mSeq.next());
    return (mN == 1) ? Z.ONE : result;
  }
}
