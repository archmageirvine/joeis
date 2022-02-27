package irvine.oeis.a001;

import irvine.oeis.NoncomputableSequence;

/**
 * A001695 a(n) = H_n(2,n) where H_n is the n-th hyperoperator.
 * @author Sean A. Irvine
 */
public class A001695 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A001695() {
    super(1, 3, 4, 8, 65536);
  }
}
