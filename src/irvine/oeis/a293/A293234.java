package irvine.oeis.a293;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a010.A010052;
import irvine.oeis.a046.A046951;

/**
 * A293234 a(n) is the number of proper divisors of n that are square.
 * @author Georg Fischer
 */
public class A293234 extends AbstractSequence {

  private final A046951 mSeq1 = new A046951();
  private final A010052 mSeq2 = new A010052();

  /** Construct the sequence. */
  public A293234() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
