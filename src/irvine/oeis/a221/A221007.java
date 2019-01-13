package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221007.
 * @author Sean A. Irvine
 */
public class A221007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221007() {
    super(new long[] {128, -288, 232, -86, 15}, new long[] {4470, 80313, 838203, 6691695, 45640599});
  }
}
