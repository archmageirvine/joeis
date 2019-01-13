package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169711.
 * @author Sean A. Irvine
 */
public class A169711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169711() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 20, 93, 256});
  }
}
