package irvine.oeis.a203;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a026.A026837;
import irvine.oeis.a026.A026838;

/**
 * A203568 a(n) = A026837(n) - A026838(n).
 * @author Georg Fischer
 */
public class A203568 extends AbstractSequence {

  private int mN = -1;

  private final A026837 mSeq1 = new A026837();
  private final A026838 mSeq2 = new A026838();

  /** Construct the sequence. */
  public A203568() {
    super(0);
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : mSeq1.next().subtract(mSeq2.next());
  }
}
