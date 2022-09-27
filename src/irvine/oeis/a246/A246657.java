package irvine.oeis.a246;
// manually hygeom/hygeo at 2022-08-05 15:24

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a129.A129164;

/**
 * A246657 a(n) = round(3F2([1, 3/2, 1 - n], [2, 2], -4)).
 * @author Georg Fischer
 */
public class A246657 extends A129164 {

  private int mN = -1;

  @Override
  public int getOffset() {
    return 0;
  }

  /** Construct the sequence. */
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : new Q(super.next(), Z.valueOf(mN)).round();
  }
}
