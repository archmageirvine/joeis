package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022936 <code>a(n) = a(n-1) + c(n-1)</code> for <code>n &gt;= 2, a( )</code> increasing, given <code>a(1)=4;</code> where <code>c( )</code> is complement of <code>a( )</code>.
 * @author Sean A. Irvine
 */
public class A022936 extends A022935 {

  @Override
  protected Z start() {
    return Z.FOUR;
  }
}
