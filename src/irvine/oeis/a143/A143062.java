package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.a203.A203568;

/**
 * A143062 Expansion of false theta series variation of Euler's pentagonal number series in powers of x.
 * @author Georg Fischer
 */
public class A143062 extends A203568 {

  private int mN = -1;

  @Override
  // a(n) = A026838(n) - A026837(n)
  public Z next() {
    return (++mN == 0) ? super.next().add(1) : super.next().negate();
  }
}
