package irvine.oeis.a088;

import irvine.math.z.Z;

/**
 * A088575 Bisection of A088567.
 * @author Georg Fischer
 */
public class A088575 extends A088567 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
