package irvine.oeis.a076;
// Generated by gen_seq4.pl andiv 2023-01-11 22:52

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A076927 a(n) = A076926(n)/n.
 * @author Georg Fischer
 */
public class A076927 extends AbstractSequence {

  private final A076926 mSeq1 = new A076926();
  private int mN;

  /** Construct the sequence. */
  public A076927() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(++mN);
  }
}
