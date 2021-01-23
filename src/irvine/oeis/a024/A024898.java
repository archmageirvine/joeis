package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a007.A007528;

/**
 * A024898 Positive integers k such that 6*k - 1 is prime.
 * @author Sean A. Irvine
 */
public class A024898 extends A007528 {

  @Override
  public Z next() {
    return super.next().add(1).divide(6);
  }
}
