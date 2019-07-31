package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024960 <code>s(n+3)/4</code>, where s is <code>A024959</code>.
 * @author Sean A. Irvine
 */
public class A024960 extends A024959 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
