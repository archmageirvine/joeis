package irvine.oeis.a319;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a003.A003145;
import irvine.oeis.a003.A003146;


/**
 * A319969 a(n) = A003145(A003146(n)).
 * Formula: <code>a(n) = A003145(A003146(n)).</code>
 * @author Georg Fischer
 */
public class A319969 extends NestedSequence {

  /** Construct the sequence. */
  public A319969() {
    super(1, new A003145(), new A003146(), 1, 1); 
  }

}
