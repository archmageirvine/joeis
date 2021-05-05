package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A046933 Number of composites between successive primes.
 * @author Sean A. Irvine
 */
public class A046933 extends A001223 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

