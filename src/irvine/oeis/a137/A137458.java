package irvine.oeis.a137;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a007.A007913;


/**
 * A137458 Prime(core(n)).
 * Formula: <code>a(n) = A000040(A007913(n)).</code>
 * @author Georg Fischer
 */
public class A137458 extends NestedSequence {

  /** Construct the sequence. */
  public A137458() {
    super(1, new A000040(), new A007913(), 1, 1); 
  }

}
