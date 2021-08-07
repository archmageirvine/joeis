package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049709 (1/2)*Sum{T(i,n-i): i=0,1,...,n}, array T as in A049704.
 * @author Sean A. Irvine
 */
public class A049709 extends A049708 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
