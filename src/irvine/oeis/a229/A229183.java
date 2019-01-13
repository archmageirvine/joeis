package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229183.
 * @author Sean A. Irvine
 */
public class A229183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229183() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 2, 7, 18});
  }
}
