package irvine.oeis.a085;
// Generated by gen_seq4.pl num1dis at 2021-04-28 10:09

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;


/**
 * A085861 Number of 7's in decimal expansion of Fibonacci(n).
 * @author Georg Fischer
 */
public class A085861 extends A000045 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitCounts(super.next(), 10)[7]);
  }
}
