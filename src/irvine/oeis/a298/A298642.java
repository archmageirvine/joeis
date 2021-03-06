package irvine.oeis.a298;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a280.A280129;


/**
 * A298642 Number of partitions of n^2 into distinct squares &gt; 1.
 * Formula: <code>a(n) = A280129(A000290(n)).</code>
 * @author Georg Fischer
 */
public class A298642 extends NestedSequence {

  /** Construct the sequence. */
  public A298642() {
    super(0, new A280129(), new A000290(), 0, 0); 
  }

}
