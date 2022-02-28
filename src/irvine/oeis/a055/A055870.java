package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a010.A010048;

/**
 * A055870 Signed Fibonomial triangle.
 * a(n, m)=(-1)^floor((m+1)/2)*A010048(n, m).
 * @author Georg Fischer
 */
public class A055870 extends A010048 {

  @Override
  public Z next() {
    return super.next().multiply((((mCol + 1) / 2) & 1) == 0 ? 1 : -1);
  }
}
