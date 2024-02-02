package irvine.oeis.a067;

import irvine.oeis.RecordSequence;

/**
 * A067288 Records for the number of integers k such that k is not of the form m + reverse(m) for any m and for some n A067030(n) occurs in the 'Reverse and Add' trajectory of k (cf. A067284).
 * @author Sean A. Irvine
 */
public class A067288 extends RecordSequence {

  /** Construct the sequence. */
  public A067288() {
    super(1, new A067284());
  }
}
