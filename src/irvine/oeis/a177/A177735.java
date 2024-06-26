package irvine.oeis.a177;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002445;
import irvine.oeis.a020.A020793;

/**
 * A177735 a(0)=1, a(n)=A002445(n)/6 for n&gt;=1.
 * @author Georg Fischer
 */
public class A177735 extends AbstractSequence {

  private final A002445 mSeq1 = new A002445();
  private final A020793 mSeq2 = new A020793();

  /** Construct the sequence. */
  public A177735() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
