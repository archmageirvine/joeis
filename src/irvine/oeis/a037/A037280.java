package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037280 If n is composite replace n with the concatenation of its nontrivial divisors [ A037279 ] then divide out any factors of 2.
 * @author Sean A. Irvine
 */
public class A037280 extends A037279 {

  @Override
  public Z next() {
    return super.next().makeOdd();
  }
}

