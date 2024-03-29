package irvine.oeis.a349;
// Generated by gen_seq4.pl dersimple at 2022-12-15 23:30

import irvine.math.z.Z;
import irvine.oeis.a053.A053415;

/**
 * A349609 Number of solutions to x^2 + y^2 &lt;= n^2, where x, y are positive odd integers.
 * @author Georg Fischer
 */
public class A349609 extends A053415 {

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
