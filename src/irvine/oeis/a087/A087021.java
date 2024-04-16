package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a004.A004042;

/**
 * A087021 Number of distinct prime factors of n-th cyclic number.
 * @author Sean A. Irvine
 */
public class A087021 extends A004042 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}

