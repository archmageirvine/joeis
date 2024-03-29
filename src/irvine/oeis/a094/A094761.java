package irvine.oeis.a094;
// Generated by gen_seq4.pl simple3 at 2023-03-24 12:16

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a053.A053186;

/**
 * A094761 a(n) = n + (square excess of n).
 * @author Georg Fischer
 */
public class A094761 extends AbstractSequence {

  private int mN = -1;
  private final A053186 mSeq = new A053186();

  /** Construct the sequence. */
  public A094761() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(mSeq.next());
  }
}
