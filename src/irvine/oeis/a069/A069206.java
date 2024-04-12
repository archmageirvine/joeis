package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069206 Let m(n,k) be the sequence defined by m(n,1)=1, m(n,2)=n, m(n,k+2)=(m(n,k+1)+m(n,k))/2 if m(n,k+1)+m(n,k) is even, m(n,k+2)=m(n,k+1)-m(n,k) otherwise. Sequence gives the (experimentally unique) solution to m(n,x)=0 (for k &gt; this solution m(n,k) is constant = +1 or -1 depending on n) or a(n)=0 if there is no solution (in this case the cycle (1,3,2,-1,-3,-2) is reached).
 * @author Sean A. Irvine
 */
public class A069206 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ONE.equals(mN) || mN.mod(7) == 3) {
      return Z.ZERO;
    }
    Z a = Z.ONE;
    Z b = mN;
    long k = 2;
    while (!b.isZero()) {
      final Z t = a.add(b);
      if (t.isEven()) {
        a = b;
        b = t.divide2();
      } else {
        final Z u = b.subtract(a);
        a = b;
        b = u;
      }
      ++k;
    }
    return Z.valueOf(k);
  }
}

