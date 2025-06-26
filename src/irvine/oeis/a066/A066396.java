package irvine.oeis.a066;
// manually 2025-06-24

import irvine.math.z.Z;
import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000521;

/**
 * A066396 Reversion of j-function (see A000521).
 * new A000521()
 * @author Georg Fischer
 */
public class A066396 extends PolynomialFieldSequence {

  private int mN;

  /** Construct the sequence. */
  public A066396() {
    super(-1, "[1],[0,0,1]", "x,B,<1,rev,p1,/", 2, 0, 1, 1, new A000521());
    mN = -2;
  }

  @Override
  public Z next() {
    if (++mN == -1) {
      super.next();
      return Z.ONE;
    }
    return super.next();
  }
}
