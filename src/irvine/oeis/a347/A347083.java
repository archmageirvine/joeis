package irvine.oeis.a347;
// Generated by gen_seq4.pl anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a168.A168036;

/**
 * A347083 Sum of -A168036 and its Dirichlet inverse.
 * @author Georg Fischer
 */
public class A347083 extends AbstractSequence {

  private final A347082 mSeq1 = new A347082();
  private final A168036 mSeq2 = new A168036();

  /** Construct the sequence. */
  public A347083() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
