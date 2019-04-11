package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000894 <code>a(n) = (2*n)!*(2*n+1)! /((n+1)! *n!^3)</code>.
 * @author Sean A. Irvine
 */
public class A000894 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN + 1, mN).multiply(Binomial.binomial(2 * mN, mN));
  }
}

