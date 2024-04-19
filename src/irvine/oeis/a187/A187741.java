package irvine.oeis.a187;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A187741 G.f.: Sum_{n&gt;=0} (1 + n*x)^n * x^n / (1 + x + n*x^2)^n.
 * @author Georg Fischer
 */
public class A187741 extends Sequence0 {

  private int mN = -1;

  /** Construct the sequence. */
  public Z next() {
    // a(2*n) = (n+1)!/2,  a(2*n-1) = n!,  for n>0 with a(0)=1.
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return ((mN & 1) == 1) ? Functions.FACTORIAL.z((mN + 1) / 2) : Functions.FACTORIAL.z(mN / 2 + 1).divide2();
  }
}
