package irvine.oeis.a260;
// Generated by gen_seq4.pl m1pow/m1mul at 2023-06-04 18:45

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000025;

/**
 * A260460 Expansion of f(-q) in powers of q where f() is a 3rd order mock theta function.
 * @author Georg Fischer
 */
public class A260460 extends AbstractSequence {

  private int mN = -1;
  private final A000025 mSeq = new A000025();

  /** Construct the sequence. */
  public A260460() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq.next().multiply(((mN & 1) == 0) ? 1 : -1);
  }
}
