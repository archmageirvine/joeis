package irvine.oeis.a294;
// Generated by gen_seq4.pl anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a018.A018252;

/**
 * A294083 a(n) is the n-th nonprime number raised to the n-th prime number.
 * @author Georg Fischer
 */
public class A294083 extends AbstractSequence {

  private final A018252 mSeq1 = new A018252();
  private final A000040 mSeq2 = new A000040();

  /** Construct the sequence. */
  public A294083() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().pow(mSeq2.next());
  }
}
