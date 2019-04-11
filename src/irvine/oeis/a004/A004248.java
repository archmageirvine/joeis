package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004248 Table of x^y, where <code>(x</code>,y) <code>= (0,0),(0,1),(1,0),(0,2),(1,1),(2,0),</code>...
 * @author Sean A. Irvine
 */
public class A004248 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 0;
      ++mN;
    }
    return Z.valueOf(mM).pow(mN - mM);
  }
}
