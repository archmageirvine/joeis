package irvine.oeis.a350;
// Generated by gen_seq4.pl simple3 at 2023-03-24 12:16

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a055.A055874;

/**
 * A350509 a(n) = n/A055874(n).
 * @author Georg Fischer
 */
public class A350509 extends AbstractSequence {

  private int mN = 0;
  private final A055874 mSeq = new A055874();

  /** Construct the sequence. */
  public A350509() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).divide(mSeq.next());
  }
}
