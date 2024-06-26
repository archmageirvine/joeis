package irvine.oeis.a321;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000312;
import irvine.oeis.a023.A023887;

/**
 * A321259 a(n) = sigma_n(n) - n^n.
 * @author Georg Fischer
 */
public class A321259 extends AbstractSequence {

  private final A023887 mSeq1 = new A023887();
  private final A000312 mSeq2 = new A000312();

  /** Construct the sequence. */
  public A321259() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
