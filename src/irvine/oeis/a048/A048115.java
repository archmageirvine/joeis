package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048115 (1/2)*Sum{T(n,i): i=0,1,...,n}, where T is given by A048113.
 * @author Sean A. Irvine
 */
public class A048115 extends A048114 {

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
