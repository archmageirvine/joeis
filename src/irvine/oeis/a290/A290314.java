package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290314 Fifth diagonal sequence of the Sheffer triangle A094816 (special Charlier).
 * @author Sean A. Irvine
 */
public class A290314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290314() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 89, 814, 4179, 15659, 47775, 125853, 296703, 641058});
  }
}
