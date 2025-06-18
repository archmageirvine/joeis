package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384875 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A384875 extends Sequence1 {

  private long mN = 2;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      ++mN;
      mM = mN / 3;
    }
    return Functions.NEXT_PRIME.z(Z.ONE.shiftLeft(mN - 2 * mM)).shiftLeft(mM);
  }
}

