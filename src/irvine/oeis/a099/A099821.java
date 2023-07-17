package irvine.oeis.a099;
// manually (bisect) 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a007.A007088;

/**
 * A099821 Odd positive integers in base 2 (bisection of A007088).
 * @author Georg Fischer
 */
public class A099821 extends A007088 {

  /** Construct the sequence. */
  public A099821() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
