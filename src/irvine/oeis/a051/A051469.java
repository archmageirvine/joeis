package irvine.oeis.a051;
// Generated by gen_seq4.pl divmul at 2021-08-20 23:57

import irvine.math.z.Z;
import irvine.oeis.a029.A029643;

/**
 * A051469 (Terms in A029643)/2.
 * @author Georg Fischer
 */
public class A051469 extends A029643 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
