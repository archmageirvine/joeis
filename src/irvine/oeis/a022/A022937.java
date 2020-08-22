package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022937 a(n) = a(n-1) + c(n-1) for n &gt;= 2, a( ) increasing, given a(1)=5; where c( ) is complement of a( ).
 * @author Sean A. Irvine
 */
public class A022937 extends A022935 {

  @Override
  protected Z start() {
    return Z.FIVE;
  }
}
