package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence0;

/**
 * A020516 Sum of n-th powers of divisors of 64.
 * @author Sean A. Irvine
 */
public class A020516 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(7, Z.ONE.shiftLeft(++mN));
  }
}
