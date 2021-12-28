package irvine.oeis.a101;

import irvine.math.z.Z;

/**
 * A101623 Modular binomial transform of 10^n.
 * @author Georg Fischer
 */
public class A101623 extends A101624 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
