package irvine.oeis.a109;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a034.A034953;
import irvine.oeis.a056.A056604;

/**
 * A109923 a(n) = lcm(1,2,3,...,prime(n))/(1 + 2 + ... + prime(n)).
 * @author Georg Fischer
 */
public class A109923 extends AbstractSequence {

  private final A056604 mSeq1 = new A056604();
  private final A034953 mSeq2 = new A034953();

  /** Construct the sequence. */
  public A109923() {
    super(2);
    mSeq1.next();
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
