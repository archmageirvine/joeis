package irvine.oeis.a162;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a007.A007088;
import irvine.oeis.a014.A014499;


/**
 * A162720 A014499 represented in binary.
 * Formula: <code>a(n) = A007088(A014499(n)).</code>
 * @author Georg Fischer
 */
public class A162720 extends NestedSequence {

  /** Construct the sequence. */
  public A162720() {
    super(1, new A007088(), new A014499(), 0, 1); 
  }

}
