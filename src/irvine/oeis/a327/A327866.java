package irvine.oeis.a327;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a003.A003415;
import irvine.oeis.a010.A010052;


/**
 * A327866 a(n) = 1 if arithmetic derivative of n is square, 0 otherwise. Cf. A003415.
 * Formula: <code>a(n) = A010052(A003415(n)).</code>
 * @author Georg Fischer
 */
public class A327866 extends NestedSequence {

  /** Construct the sequence. */
  public A327866() {
    super(0, new A010052(), new A003415(), 0, 0); 
  }

}
