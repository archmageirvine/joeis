package irvine.oeis.a192;
// Generated by gen_seq4.pl flosqrt A051286 at 2021-04-08 22:54
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a051.A051286;


/**
 * A192685 Floor-Sqrt transform of numbers of A051286.
 * @author Georg Fischer
 */
public class A192685 extends A051286 {

  @Override
  public Z next() {
    return CR.valueOf(super.next()).sqrt().floor();
  }
}
