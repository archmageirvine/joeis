package irvine.oeis.a338;
// manually anopsn 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a066.A066643;

/**
 * A338020 a(n) is the number of circles of positive integer area with radii less than n and greater than n - 1.
 * @author Georg Fischer
 */
public class A338020 extends AbstractSequence {

  private int mN = 0;
  private A066643 mSeq1 = new A066643();
  private Z mA;

  /** Construct the sequence. */
  public A338020() {
    super(1);
    mSeq1.next();
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.THREE;
    }
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
