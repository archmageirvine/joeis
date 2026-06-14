package irvine.oeis.a085;

import irvine.oeis.PartialSumSequence;

/**
 * A085302 a(n) is the partial sum of A085301(j) from j=1 to n; a(n)-1 shows the number of factorials below n-th primorial.
 * @author Sean A. Irvine
 */
public class A085302 extends PartialSumSequence {

  /** Construct the sequence. */
  public A085302() {
    super(1, new A085301());
  }
}
