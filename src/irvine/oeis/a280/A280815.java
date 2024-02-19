package irvine.oeis.a280;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a049.A049502;
import irvine.oeis.a051.A051953;

/**
 * A280815 a(n) = A049502(cototient(n)).
 * Formula: <code>a(n) = A049502(A051953(n)).</code>
 * @author Georg Fischer
 */
public class A280815 extends AbstractSequence {

  private final A049502 mSeq1 = new A049502();
  private final Sequence mSeq2 = new A051953();

  /** Construct the sequence. */
  public A280815() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.a(mSeq2.next());
  }
}
