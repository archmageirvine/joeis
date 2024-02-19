package irvine.oeis.a280;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a049.A049502;

/**
 * A280799 a(n) = A049502(phi(n)).
 * Formula: <code>a(n) = A049502(A000010(n)).</code>
 * @author Georg Fischer
 */
public class A280799 extends AbstractSequence {

  private final A049502 mSeq1 = new A049502();
  private final Sequence mSeq2 = new A000010();

  /** Construct the sequence. */
  public A280799() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.a(mSeq2.next());
  }
}
