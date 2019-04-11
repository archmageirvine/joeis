package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002546 Denominator of Sum_{i+j+k=n; i,j,k <code>&gt; 0}</code> 1/(i*j*k).
 * @author Sean A. Irvine
 */
public class A002546 extends A002545 {

  @Override
  public Z next() {
    return step().den();
  }
}
