package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005469 <code>a(n)=1+a([ n/2 ]) a(</code> ceiling <code>( n/2 ) )</code>.
 * @author Sean A. Irvine
 */
public class A005469 extends A005510 {

  @Override
  protected Z start() {
    return Z.TWO;
  }
}
