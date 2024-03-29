package irvine.oeis.a166;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000301;
import irvine.oeis.a010.A010098;

/**
 * A166470 a(n) = 2^F(n+1)*3^F(n), where F(n) is the n-th Fibonacci number, A000045(n).
 * @author Georg Fischer
 */
public class A166470 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A166470(final int offset) {
    super(offset);
  }

  final Sequence mA000301 = new A000301();
  final Sequence mA010098 = new A010098();

  /** Construct the sequence. */
  public A166470() {
    super(0);
    mA000301.next();
  }

  @Override
  public Z next() {
    return mA000301.next().multiply(mA010098.next());
  }

}

