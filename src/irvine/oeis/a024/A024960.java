package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024960 s(n+3)/4, where s is A024959.
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
