package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.a196.A196873;

/**
 * A185142 E.g.f. A(x) = Sum_{n&gt;=0} a(n)*x^(2*n+1)/(2*n+1)! is inverse function to x*cos(x).
 * @author Georg Fischer
 */
public class A185142 extends A196873 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.next().multiply(2L * mN + 1);
  }
}
