package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A059913 Triangle T(n,k) of numbers of n degree irreducible polynomials over GF(2) which have order A059912(n,k), k=1..A059499(n).
 * @author Sean A. Irvine
 */
public class A059913 extends A059912 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      super.next();
      return Z.TWO;
    }
    return Functions.PHI.z(super.next()).divide(mN);
  }
}
