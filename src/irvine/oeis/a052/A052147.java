package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052147 a(n) = prime(n) + 2.
 * @author Sean A. Irvine
 */
public class A052147 extends A000040 {

  @Override
  public Z next() {
    return super.next().add(2);
  }
}

