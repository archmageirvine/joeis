package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046633 Number of cubic residues <code>mod 5^n</code>.
 * @author Sean A. Irvine
 */
public class A046633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046633() {
    super(new long[] {-5, 1, 0, 5}, new long[] {1, 5, 21, 101});
  }
}
