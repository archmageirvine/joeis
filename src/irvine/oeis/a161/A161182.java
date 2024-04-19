package irvine.oeis.a161;
// manually anopsn 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a078.A078435;

/**
 * A161182 Successive differences between positions of squares in list of nonprimes.
 * @author Georg Fischer
 */
public class A161182 extends AbstractSequence {

  private int mN = 0;
  private final A078435 mSeq1 = new A078435();
  private Z mA;

  /** Construct the sequence. */
  public A161182() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
