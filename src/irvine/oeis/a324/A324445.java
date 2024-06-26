package irvine.oeis.a324;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001147;
import irvine.oeis.a003.A003436;

/**
 * A324445 Number of labeled cyclic chord diagrams with n chords such that the minimal chord length equals one.
 * @author Georg Fischer
 */
public class A324445 extends AbstractSequence {

  private final A001147 mSeq1 = new A001147();
  private final A003436 mSeq2 = new A003436();

  /** Construct the sequence. */
  public A324445() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
