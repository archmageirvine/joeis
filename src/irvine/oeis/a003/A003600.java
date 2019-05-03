package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003600 Maximal number of pieces obtained by slicing a torus (or <code>a</code> bagel) with n cuts: <code>(n^3 + 3*n^2 + 8*n)/6 (n &gt; 0)</code>.
 * @author Sean A. Irvine
 */
public class A003600 implements Sequence {

  private long mN = -1;
  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Z.valueOf(mN).add(3).multiply(mN).add(8).multiply(mN).divide(6);
  }
}
