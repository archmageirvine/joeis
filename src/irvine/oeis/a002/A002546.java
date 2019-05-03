package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002546 Denominator of <code>Sum_{i+j+k=n</code>; i,j,k <code>&gt; 0} 1/(i*j*k)</code>.
 * @author Sean A. Irvine
 */
public class A002546 extends A002545 {

  @Override
  public Z next() {
    return step().den();
  }
}
