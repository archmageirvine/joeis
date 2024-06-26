package irvine.oeis.a074;
// Generated by gen_seq4.pl andiv 2023-01-11 22:52

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a066.A066066;

/**
 * A074766 a(n) = prime(2n) - 2*prime(n) - n.
 * @author Georg Fischer
 */
public class A074766 extends AbstractSequence {

  private final A066066 mSeq1 = new A066066();
  private int mN;

  /** Construct the sequence. */
  public A074766() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(++mN);
  }
}
