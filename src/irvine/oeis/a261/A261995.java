package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261995.
 * @author Sean A. Irvine
 */
public class A261995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261995() {
    super(new long[] {1, -1, 0, 0, -110, 110, 0, 0, 1}, new long[] {42, 123, 315, 1827, 4659, 13650, 34794, 201114, 512610});
  }
}
