package irvine.oeis.a206;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a085.A085614;

/**
 * A206300 Expand the real root of y^3 - y + x in powers of x, then multiply coefficient of x^n by -4^n to get integers.
 * @author Georg Fischer
 */
public class A206300 extends AbstractSequence {

  private int mN = -1;
  private final A085614 mSeq = new A085614();

  /** Construct the sequence. */
  public A206300() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.NEG_ONE : Z.TWO.multiply(mSeq.next());
  }
}
