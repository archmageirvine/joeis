package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a003.A003422;

/**
 * A014288 a(n) = floor(Sum_{k=0..n} k!/2), or floor( A003422(n+1)/2 ).
 * @author Sean A. Irvine
 */
public class A014288 extends A003422 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
