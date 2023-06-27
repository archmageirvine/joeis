package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085292 Product of Lucas (A000204) and a Pell companion series (A001333).
 * @author Sean A. Irvine
 */
public class A085292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085292() {
    super(1, new long[] {-1, 2, 7, 2}, new long[] {1, 9, 28, 119});
  }
}
