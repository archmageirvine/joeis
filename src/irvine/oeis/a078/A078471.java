package irvine.oeis.a078;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a024.A024916;
import irvine.oeis.a271.A271342;

/**
 * A078471 Sum of all odd divisors of all positive integers &lt;= n.
 * @author Georg Fischer
 */
public class A078471 extends AbstractSequence {

  private final A024916 mSeq1 = new A024916();
  private final A271342 mSeq2 = new A271342();

  /** Construct the sequence. */
  public A078471() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
