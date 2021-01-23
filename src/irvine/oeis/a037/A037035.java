package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a013.A013597;

/**
 * A037035 Least k such that 2^n+1+k is a prime.
 * @author Sean A. Irvine
 */
public class A037035 extends A013597 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

