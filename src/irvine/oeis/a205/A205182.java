package irvine.oeis.a205;
// manually unsigned at 2021-11-01 18:36

import irvine.math.z.Z;
import irvine.oeis.a013.A013068;

/**
 * A205182 E.g.f.: (cosh(x) + sin(x)) / (cos(x) - sinh(x)).
 * @author Georg Fischer
 */
public class A205182 extends A013068 {

  /** Construct the sequence. */
  public A205182() {
    super.next();
  }
  
  @Override
  public Z next() {
    return super.next().abs();
  }
}
