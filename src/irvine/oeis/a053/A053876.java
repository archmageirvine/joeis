package irvine.oeis.a053;

import irvine.math.group.GaloisField;

/**
 * A053876 Number of elements of order 6 in GL(n,2).
 * @author Sean A. Irvine
 */
public class A053876 extends A053875 {

  /** Construct the sequence. */
  public A053876() {
    super(6, new GaloisField(2));
  }
}
