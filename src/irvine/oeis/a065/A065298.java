package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065298 a(n+1) is the smallest number &gt; a(n) such that the digits of a(n)^2 are all (with multiplicity) properly contained in the digits of a(n+1)^2, with a(0)=2.
 * @author Sean A. Irvine
 */
public class A065298 extends A065297 {

  /** Construct the sequence. */
  public A065298() {
    super(Z.TWO);
  }
}
