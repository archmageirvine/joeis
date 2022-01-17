package irvine.oeis.a053;

import irvine.math.group.GaloisField;

/**
 * A053877 Number of elements of order 8 in GL(n,2).
 * @author Sean A. Irvine
 */
public class A053877 extends A053875 {

  /** Construct the sequence. */
  public A053877() {
    super(8, new GaloisField(2));
  }
}
