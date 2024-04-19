package irvine.oeis.a342;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a062.A062968;
import irvine.oeis.a065.A065608;

/**
 * A342527 Number of compositions of n with alternating parts equal.
 * @author Georg Fischer
 */
public class A342527 extends AbstractSequence {

  private int mN = -1;
  private final A065608 mSeq1 = new A065608();
  private final A062968 mSeq2 = new A062968();

  /** Construct the sequence. */
  public A342527() {
    super(0);
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : mSeq1.next().add(mSeq2.next());
  }
}
