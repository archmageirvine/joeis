package irvine.oeis.a076;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a007.A007947;
import irvine.oeis.a008.A008683;


/**
 * A076479 a(n) = mu(rad(n)), where mu is the Moebius-function (A008683) and rad is the radical or squarefree kernel (A007947).
 * Formula: <code>a(n) = A008683(A007947(n)).</code>
 * @author Georg Fischer
 */
public class A076479 extends NestedSequence {

  /** Construct the sequence. */
  public A076479() {
    super(1, new A008683(), new A007947(), 1, 1); 
  }

}
