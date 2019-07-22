package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024736 <code>s(n+3)/2</code>, where s is <code>A024735</code>.
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
