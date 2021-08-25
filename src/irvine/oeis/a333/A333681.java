package irvine.oeis.a333;
// manually dersimple at 2021-08-25 21:26

import irvine.math.z.Z;
import irvine.oeis.a000.A000519;

/**
 * A333681 Number of non-isomorphic n X n binary matrices with all row and column sums equal up to permutation of rows and columns.
 * @author Georg Fischer
 */
public class A333681 extends A000519 {

  private int mN = 0;
  
  @Override
  public Z next() {
    ++mN;
    return mN <= 1 ? Z.ONE : super.next().add(1);
  }
}
