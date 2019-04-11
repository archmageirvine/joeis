package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155753 <code>(n^3 - n + 9)/3</code>.
 * @author Sean A. Irvine
 */
public class A155753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155753() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 5, 11, 23});
  }
}
