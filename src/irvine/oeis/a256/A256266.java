package irvine.oeis.a256;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a255.A255748;

/**
 * A256266 Total number of ON states after n generations of cellular automaton based on triangles (see Comments lines for definition).
 * @author Georg Fischer
 */
public class A256266 extends AbstractSequence {

  private int mN = -1;
  private final A255748 mSeq = new A255748();

  /** Construct the sequence. */
  public A256266() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : Z.SIX.multiply(mSeq.next());
  }
}
