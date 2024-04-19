package irvine.oeis.a069;
// manually anopan 0,0

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005249;

/**
 * A069651 For n &gt;= 1, let M_n be the n X n matrix with M_n(i,j) = i^2/(i+j); then a(n) = 1/det(M_n). Also, a(0) = 1 by convention.
 * @author Georg Fischer
 */
public class A069651 extends A005249 {

  private int mN = 0;

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.ONE : super.next().divide(Functions.FACTORIAL.z(mN * 2 - 1));
  }
}
