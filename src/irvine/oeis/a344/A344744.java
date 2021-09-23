package irvine.oeis.a344;
// manually dersimpln at 2021-09-22 20:48

import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A344744 a(n) is the n-th power of the concatenation of the integers from 0 through n-1.
 * @author Georg Fischer
 */
public class A344744 extends A007908 {

  protected int mN = 0;

  @Override
  public Z next() {
    ++mN; 
    return mN == 1 ? Z.ZERO : super.next().pow(mN);
  }
}
