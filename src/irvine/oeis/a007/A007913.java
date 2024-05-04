package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007913 Squarefree part of n: a(n) is the smallest positive number m such that n/m is a square.
 * @author Sean A. Irvine
 */
public class A007913 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.CORE.z(++mN);
  }
}
