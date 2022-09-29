package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a058.A058377;

/**
 * A059529 For 1 &lt; x, each c(i) is "multiply" (*) or "divide" (/); a(n) is number of choices for c(0),...,c(n-1) so that 1 c(0) x^1 c(1) x^2,.., c(n-1) x^n is an integer.
 * @author Sean A. Irvine
 */
public class A059529 extends A058377 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().add(Z.ONE.shiftLeft(mN - 1));
  }
}
