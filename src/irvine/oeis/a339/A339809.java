package irvine.oeis.a339;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a019.A019565;

/**
 * A339809 a(n) = A019565(n) - 1.
 * @author Georg Fischer
 */
public class A339809 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A339809(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A339809() {
    super(0);
  }

  final Sequence mA019565 = new A019565();

  @Override
  public Z next() {
    return mA019565.next().subtract(Z.ONE);
  }

}
