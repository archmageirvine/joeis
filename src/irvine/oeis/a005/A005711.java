package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005711.
 * @author Sean A. Irvine
 */
public class A005711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005711() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 2});
  }
}

