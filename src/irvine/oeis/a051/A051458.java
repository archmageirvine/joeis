package irvine.oeis.a051;
// Generated by gen_seq4.pl divmul at 2021-08-20 23:57

import irvine.math.z.Z;
import irvine.oeis.a029.A029631;

/**
 * A051458 (Terms in A029631)/2.
 * @author Georg Fischer
 */
public class A051458 extends A029631 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
