package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A006005 The odd prime numbers together with 1.
 * @author Sean A. Irvine
 */
public class A006005 extends A000040 {

  @Override
  public Z next() {
    return super.next().subtract(1).or(Z.ONE);
  }
}

