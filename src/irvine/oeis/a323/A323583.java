package irvine.oeis.a323;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.a070.A070933;

/**
 * A323583 Number of ways to split an integer partition of n into consecutive subsequences.
 * @author Georg Fischer
 */
public class A323583 extends A070933 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next().divide2();
    return (mN == 0) ? Z.ONE : result;
  }
}
