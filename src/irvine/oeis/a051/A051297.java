package irvine.oeis.a051;
// Generated by gen_seq4.pl divmul at 2021-08-20 23:57

import irvine.math.z.Z;
import irvine.oeis.a028.A028266;

/**
 * A051297 (Terms in A028266)/2.
 * @author Georg Fischer
 */
public class A051297 extends A028266 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
