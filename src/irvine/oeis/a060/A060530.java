package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060530.
 * @author Sean A. Irvine
 */
public class A060530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060530() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 1, 218, 22815, 703760, 10194250, 90775566, 576941778, 2863870080L, 11769161895L, 41669295250L, 130772947481L, 371513523888L});
  }
}
