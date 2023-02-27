package irvine.oeis.a130;

import irvine.math.z.Z;
import irvine.oeis.a067.A067078;

/**
 * A130045 Denominator of polynomial a[1]=1, a[2]-&gt;1+1/(x*a[1]), a[3]-&gt;1+1/(2*x*a[2]), a[4]-&gt;1+1/(3*x*a[3]),.. giving 1,(1+x)/x,(3+2*x)/(2*(1+x)),(2+11*x+6*x^2)/(3*x*(3+2*x)), .. at x-&gt; -1. Absolute values are equal to A067078(n)/n.
 * @author Georg Fischer
 */
public class A130045 extends A067078 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ONE : super.next().multiply(mN).multiply(mN <= 2 ? 1 : ((mN - 1) % 4 < 2 ? 1 : -1));
  }
}
