package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000894 a(n) = (2*n)!*(2*n+1)! /((n+1)! *n!^3).
 * @author Sean A. Irvine
 */
public class A000894 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2L * mN + 1, mN).multiply(Binomial.binomial(2L * mN, mN));
  }
}

