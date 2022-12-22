package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a001.A001045;

/**
 * A081857 Jacobsthal sequence (A001045) as represented in base 4.
 * @author Georg Fischer
 */
public class A081857 extends A001045 {

  @Override
  public Z next() {
    return new Z(super.next().toString(4));
  }
}
