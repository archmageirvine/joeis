package irvine.oeis.a102;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006218;
import irvine.oeis.a052.A052488;

/**
 * A102722 Given n, sum all division remainders {n/k}, with k=1,...,n. The value a(n) is given by the floor of that sum. Note that {x}:=x-[x].
 * @author Georg Fischer
 */
public class A102722 extends AbstractSequence {

  private final A052488 mSeq1 = new A052488();
  private final A006218 mSeq2 = new A006218();

  /** Construct the sequence. */
  public A102722() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
