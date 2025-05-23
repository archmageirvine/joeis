package irvine.oeis.a192;
// Generated by gen_seq4.pl flosqrt A002801 at 2021-04-08 22:54
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a002.A002801;


/**
 * A192680 Floor-Sqrt transform of Sylvester continuants (A002801).
 * @author Georg Fischer
 */
public class A192680 extends A002801 {

  @Override
  public Z next() {
    return CR.valueOf(super.next()).sqrt().floor();
  }
}
