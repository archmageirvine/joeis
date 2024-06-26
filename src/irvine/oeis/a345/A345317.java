package irvine.oeis.a345;
// Generated by gen_seq4.pl anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000110;
import irvine.oeis.a006.A006905;

/**
 * A345317 Number of transitive but not symmetric relations on an n-set.
 * @author Georg Fischer
 */
public class A345317 extends AbstractSequence {

  private final A006905 mSeq1 = new A006905();
  private final A000110 mSeq2 = new A000110();

  /** Construct the sequence. */
  public A345317() {
    super(0);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
