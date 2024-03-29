package irvine.oeis.a331;
// Generated by gen_seq4.pl simple3 at 2023-03-24 12:16

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A331738 Multiplicative with a(p^e) = p^(e-A000265(e)), where A000265(x) gives the odd part of x.
 * @author Georg Fischer
 */
public class A331738 extends AbstractSequence {

  private int mN = 0;
  private final A331737 mSeq = new A331737();

  /** Construct the sequence. */
  public A331738() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).divide(mSeq.next());
  }
}
