package irvine.oeis.a051;
// Generated by gen_seq4.pl divmul at 2021-08-20 23:57

import irvine.math.z.Z;
import irvine.oeis.a029.A029658;

/**
 * A051428 (Terms in A029658)/2.
 * @author Georg Fischer
 */
public class A051428 extends A029658 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
