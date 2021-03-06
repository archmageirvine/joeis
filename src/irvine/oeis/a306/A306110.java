package irvine.oeis.a306;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a007.A007094;
import irvine.oeis.a032.A032863;


/**
 * A306110 Numbers with digits in {0,...,7} such that every other digit is strictly less than its neighbors.
 * Formula: <code>a(n) = A007094(A032863(n)).</code>
 * @author Georg Fischer
 */
public class A306110 extends NestedSequence {

  /** Construct the sequence. */
  public A306110() {
    super(1, new A007094(), new A032863(), 0, 1); 
  }

}
