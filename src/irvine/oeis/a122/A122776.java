package irvine.oeis.a122;
// Generated by gen_seq4.pl anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a030.A030218;
import irvine.oeis.a286.A286137;

/**
 * A122776 Expansion of eta(q^3)eta(q^5)eta(q^6)eta(q^10) + eta(q)eta(q^2)eta(q^15)eta(q^30) in powers of q.
 * @author Georg Fischer
 */
public class A122776 extends AbstractSequence {

  private final A030218 mSeq1 = new A030218();
  private final A286137 mSeq2 = new A286137();

  /** Construct the sequence. */
  public A122776() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
