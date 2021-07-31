package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a033.A033844;

/**
 * A049386 Binary order of 2^n-th prime.
 * @author Sean A. Irvine
 */
public class A049386 extends A033844 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().subtract(1).bitLength());
  }
}

