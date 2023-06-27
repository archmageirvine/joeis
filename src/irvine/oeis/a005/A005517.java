package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005517 Smallest label f(T) given to a rooted tree T with n nodes in Matula-Goebel labeling.
 * @author Sean A. Irvine
 */
public class A005517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005517() {
    super(1, new long[] {0, 0, 5, 0, 0}, new long[] {1, 2, 3, 5, 9});
  }
}
