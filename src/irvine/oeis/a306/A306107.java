package irvine.oeis.a306;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a007.A007091;
import irvine.oeis.a032.A032860;


/**
 * A306107 Numbers with digits in {0,1,2,3,4} such that every other digit is strictly less than its neighbors.
 * Formula: <code>a(n) = A007091(A032860(n)).</code>
 * @author Georg Fischer
 */
public class A306107 extends NestedSequence {

  /** Construct the sequence. */
  public A306107() {
    super(1, new A007091(), new A032860(), 0, 1); 
  }

}
