package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084980 Triangle of (multi)factorials: n-th row is (n+1)!!... {n "!"s}, (n+1)!... {n-1 "!"s}, ..., (n+1)!.
 * @author Sean A. Irvine
 */
public class A084980 extends Sequence1 {

  private int mN = 2;
  private int mM = 2;

  @Override
  public Z next() {
    if (--mM < 1) {
      mM = mN++;
    }
    return Functions.MULTIFACTORIAL.z(mM, mN);
  }
}
