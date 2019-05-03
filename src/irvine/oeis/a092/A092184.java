package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092184 Sequence <code>S_6</code> of the <code>S_r</code> family.
 * @author Sean A. Irvine
 */
public class A092184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092184() {
    super(new long[] {1, -5, 5}, new long[] {0, 1, 6});
  }
}
