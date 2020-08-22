package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a006.A006720;

/**
 * A028945 a(n) = A006720(n)^2 (squared terms of Somos-4 sequence).
 * @author Sean A. Irvine
 */
public class A028945 extends A006720 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

