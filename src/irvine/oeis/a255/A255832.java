package irvine.oeis.a255;
// Generated by gen_seq4.pl n2/n2add1 at 2022-10-25 22:41

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A255832 Least m &gt; 0 such that gcd(m^(2n+1)+2, (m+1)^(2n+1)+2) &gt; 1.
 * @author Georg Fischer
 */
public class A255832 extends AbstractSequence {

  private final A255852 mSeq1 = new A255852();

  /** Construct the sequence. */
  public A255832() {
    super(1);
  }

  {
    next();
  }

  @Override
  public Z next() {
    mSeq1.next();
    return mSeq1.next();
  }
}
