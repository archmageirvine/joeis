package irvine.oeis.a249;
// Generated by gen_seq4.pl bisect at 2021-07-05 22:21
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a003.A003961;


/**
 * A249735 Odd bisection of A003961: Replace in 2n-1 each prime factor p(k) with prime p(k+1).
 * @author Georg Fischer
 */
public class A249735 extends A003961 {
  
  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
