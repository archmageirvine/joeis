package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076110 Triangle (read by rows) in which the n-th row contains first n terms of an arithmetic progression with first term 1 and common difference (n-1).
 * @author Sean A. Irvine
 */
public class A076110 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(1 + (mN - 1) * mM);
  }
}
