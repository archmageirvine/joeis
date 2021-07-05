package irvine.oeis.a099;
// manually (bisect) 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A099817 Bisection of A000796 (decimal expansion of Pi).
 * @author Georg Fischer
 */
public class A099817 extends A000796 {

  /** Construct the sequence. */
  public A099817() {
    super.next();
  }
  
  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
