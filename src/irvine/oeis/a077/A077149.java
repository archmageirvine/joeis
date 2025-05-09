package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077149 a(1) =3. For n&gt;1, a(n) = smallest k such that there are n numbers m not relatively prime to n in range n &lt; m &lt; k.
 * @author Sean A. Irvine
 */
public class A077149 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.THREE;
    }
    long m = mN;
    long cnt = 0;
    while (cnt != mN) {
      if (Functions.GCD.l(mN, ++m) != 1) {
        ++cnt;
      }
    }
    return Z.valueOf(m + 1);
  }
}

