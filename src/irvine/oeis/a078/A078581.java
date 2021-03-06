package irvine.oeis.a078;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a003.A003415;
import irvine.oeis.a014.A014574;


/**
 * A078581 Arithmetic derivative of the average of n-th twin prime pair.
 * Formula: <code>a(n) = A003415(A014574(n)).</code>
 * @author Georg Fischer
 */
public class A078581 extends NestedSequence {

  /** Construct the sequence. */
  public A078581() {
    super(1, new A003415(), new A014574(), 0, 1); 
  }

}
