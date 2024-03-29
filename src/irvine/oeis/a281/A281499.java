package irvine.oeis.a281;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a003.A003188;
import irvine.oeis.a036.A036044;


/**
 * A281499 Write n in binary reflected Gray code, interchange the 1's and 0's, reverse the code and convert it back to decimal.
 * Formula: <code>a(n) = A036044(A003188(n)).</code>
 * @author Georg Fischer
 */
public class A281499 extends NestedSequence {

  /** Construct the sequence. */
  public A281499() {
    super(0, new A036044(), new A003188(), 0, 0); 
  }

}
