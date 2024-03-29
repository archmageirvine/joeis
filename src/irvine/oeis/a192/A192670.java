package irvine.oeis.a192;
// Generated by gen_seq4.pl flosqrt A002426 at 2021-04-08 22:54
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a002.A002426;


/**
 * A192670 Floor-Sqrt transform of central trinomial coefficients (A002426).
 * @author Georg Fischer
 */
public class A192670 extends A002426 {

  @Override
  public Z next() {
    return CR.valueOf(super.next()).sqrt().floor();
  }
}
