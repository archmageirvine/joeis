package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034846 a(n) = P(n,6) = 1+6*K(n,6)=1+6*A034783(n). P(n,6) are special primes of 6k+1. The relevant values of k are given by A034783.
 * @author Sean A. Irvine
 */
public class A034846 extends A034783 {

  @Override
  public Z next() {
    return super.next().multiply(6).add(1);
  }
}
