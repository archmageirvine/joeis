package irvine.oeis.a092;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a011.A011757;

/**
 * A092504 a(n) = prime(n) + prime(n^2).
 * @author Georg Fischer
 */
public class A092504 extends AbstractSequence {

  private final A000040 mSeq1 = new A000040();
  private final A011757 mSeq2 = new A011757();

  /** Construct the sequence. */
  public A092504() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
