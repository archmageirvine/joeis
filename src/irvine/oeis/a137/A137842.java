package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.a027.A027307;
import irvine.oeis.a032.A032349;

;

/**
 * A137842 Number of paths from (0,0) to (3n,0) that stay in first quadrant (but may touch horizontal axis) and where each step is (2,1), (1,2) or (1,-1).
 * <code>a(2n)=A027307(n); a(2n+1)=A032349(n+1).</code>
 * @author Georg Fischer
 */
public class A137842 extends A027307 {

  private final A032349 mSeq2 = new A032349();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 0) ? super.next() : mSeq2.next();
  }
}
