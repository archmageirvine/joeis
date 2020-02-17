package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a006.A006720;

/**
 * A028945 <code>a(n) = A006720(n)^2</code> (squared terms of <code>Somos-4</code> sequence).
 * @author Sean A. Irvine
 */
public class A028945 extends A006720 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

