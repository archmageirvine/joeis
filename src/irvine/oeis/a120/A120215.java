package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120215 Start with 1057 and repeatedly reverse the digits and add 2 to get the next term.
 * @author Sean A. Irvine
 */
public class A120215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120215() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1057, 7503, 3059, 9505, 5061, 1607, 7063, 3609, 9065, 5611, 1167, 7613, 3169, 9615, 5171, 1717, 7173, 3719, 9175, 5721, 1277, 7723, 3279, 9725, 5281, 1827, 7283, 3829, 9285, 5831, 1387, 7833, 3389, 9835, 5391, 1937, 7393, 3939, 9395, 5941, 1497, 7943, 3499, 9945, 5501});
  }
}
