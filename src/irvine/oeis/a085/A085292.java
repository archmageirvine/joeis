package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085292 Product of Lucas <code>(A000204)</code> and a Pell companion series <code>(A001333)</code>.
 * @author Sean A. Irvine
 */
public class A085292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085292() {
    super(new long[] {-1, 2, 7, 2}, new long[] {1, 9, 28, 119});
  }
}
