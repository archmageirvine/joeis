package irvine.oeis.a305;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003144;
import irvine.oeis.a003.A003145;

/**
 * A305373 a(n) = A003144(n) + A003145(n).
 * @author Georg Fischer
 */
public class A305373 extends AbstractSequence {

  private int mN = -1;
  private final A003144 mSeq1 = new A003144();
  private final A003145 mSeq2 = new A003145();

  /** Construct the sequence. */
  public A305373() {
    super(0);
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : mSeq1.next().add(mSeq2.next());
  }
}
