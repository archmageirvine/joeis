package irvine.oeis.a109;
// manually dersimple at 2021-08-25 19:44

import irvine.math.z.Z;
import irvine.oeis.a023.A023896;

/**
 * A109607 Sum of coprimes of n greater than 1.
 * @author Georg Fischer
 */
public class A109607 extends A023896 {

  private int mN = 0;
  
  @Override
  public Z next() {
    ++mN;
    return mN <= 1 ? Z.ZERO : super.next().subtract(1);
  }
}
