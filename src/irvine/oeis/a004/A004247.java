package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004247 Multiplication table read by antidiagonals: <code>T(i,j) = ij (i&gt;=0, j&gt;=0)</code>.
 * @author Sean A. Irvine
 */
public class A004247 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 0;
      ++mN;
    }
    return Z.valueOf(mM).multiply(mN - mM);
  }
}
