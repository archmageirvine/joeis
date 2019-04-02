package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a211.A211318;

/**
 * A010026 Triangle read by rows: number of permutations of 1..n by length of longest run.
 * @author Sean A. Irvine
 */
public class A010026 extends A211318 {

  private int mN = 1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN - 1) {
      ++mN;
      mM = 0;
    }
    return a(mN, mN - mM);
  }
}
