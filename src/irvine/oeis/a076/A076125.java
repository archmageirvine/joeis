package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076125 Define r(k) as follows: r(1)=n, r(k+1) = r(k) +(-1)^k*sign(r(k)-k)*k; then abs(r(k)) = n for at least one k&gt;1 (there could be 2 values for k &gt; 1). Sequence gives the smallest value of k &gt; 1 such that abs(r(k)) = n.
 * @author Sean A. Irvine
 */
public class A076125 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z r = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      r = r.add(Z.NEG_ONE.pow(++k).multiply(r.subtract(k).signum() * k));
      if (r.abs().equals(mN)) {
        return Z.valueOf(k + 1);
      }
    }
  }
}
