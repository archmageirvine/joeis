package irvine.oeis.a115;
// manually concprod at 2022-09-11 09:22

import irvine.math.z.Z;
import irvine.oeis.base.ConcatenatedProductSequence;

/**
 * A115438 Numbers whose square is the concatenation of two numbers k and k+4.
 * @author Georg Fischer
 */
public class A115438 extends ConcatenatedProductSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A115438() {
    super(1, "pa", 0, +4, 0);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    } else {
      return super.next();
    }
  }
}
