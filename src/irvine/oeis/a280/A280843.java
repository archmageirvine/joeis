package irvine.oeis.a280;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a049.A049502;

/**
 * A280843 a(n) = A049502(sigma(n)).
 * Formula: <code>a(n) = A049502(A000203(n)).</code>
 * @author Georg Fischer
 */
public class A280843 extends AbstractSequence {

  private final A049502 mSeq1 = new A049502();
  private final Sequence mSeq2 = new A000203();

  /** Construct the sequence. */
  public A280843() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.a(mSeq2.next());
  }
}
