package irvine.oeis.a346;
// manually unsigned at 2021-11-01 18:36

import irvine.math.z.Z;
import irvine.oeis.a000.A000111;

/**
 * A346838 a(n) = (PolyLog(-n, -i) - exp(i*Pi*n)*PolyLog(-n, i)) * i / exp(i*Pi*n/2).
 * @author Georg Fischer
 */
public class A346838 extends A000111 {

  protected int mN = -1;
  
  @Override
  public Z next() {
    return (++mN & 1) == 0 ? super.next() : super.next().negate();
  }
}
