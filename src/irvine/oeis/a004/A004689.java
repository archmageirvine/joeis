package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A004689 Fibonacci numbers written in base 6.
 * @author Sean A. Irvine
 */
public class A004689 extends A000045 {

  @Override
  public Z next() {
    return new Z(super.next().toString(6));
  }
}

