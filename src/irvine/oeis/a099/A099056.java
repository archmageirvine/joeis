package irvine.oeis.a099;
// manually 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a054.A054519;

/**
 * A099056 A bisection of A054519.
 * @author Georg Fischer
 */
public class A099056 extends A054519 {

  /** Construct the sequence */
  public A099056() {
    super.next();
  }
  
  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
