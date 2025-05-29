package irvine.oeis.a222;
// manually 2025-05-28/parmof2 at 2025-05-28 23:20

import irvine.math.z.Z;
import irvine.oeis.a056.A056193;

/**
 * A222113 Goodstein sequence starting with a(1) = 16: to calculate a(n) for n&gt;1, subtract 1 from a(n-1) and write the result in the hereditary representation base n, then bump the base to n+1.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A222113 extends A056193 {

  private Z mA = null;
  private int mN = 1;

  /** Construct the sequence. */
  public A222113() {
    super(1, 0 /* ignored */);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(16);
    } else {
      mA = code(mA.subtract(1), ++mN);
    }
    return mA;
  }
}
