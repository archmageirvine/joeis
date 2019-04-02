package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005469 a(n)=1+a([ n/2 ]) a( ceiling ( n/2 ) ).
 * @author Sean A. Irvine
 */
public class A005469 extends A005510 {

  @Override
  protected Z start() {
    return Z.TWO;
  }
}
