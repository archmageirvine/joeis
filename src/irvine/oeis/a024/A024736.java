package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024736 s(n+3)/2, where s is A024735.
 * @author Sean A. Irvine
 */
public class A024736 extends A024735 {

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
