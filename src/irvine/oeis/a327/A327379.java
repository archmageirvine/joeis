package irvine.oeis.a327;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006024;
import irvine.oeis.a006.A006125;

/**
 * A327379 Number of labeled non-mating-type graphs with n vertices.
 * @author Georg Fischer
 */
public class A327379 extends AbstractSequence {

  private final A006125 mSeq1 = new A006125();
  private final A006024 mSeq2 = new A006024();

  /** Construct the sequence. */
  public A327379() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
