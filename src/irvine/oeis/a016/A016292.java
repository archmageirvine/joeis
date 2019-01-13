package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016292.
 * @author Sean A. Irvine
 */
public class A016292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016292() {
    super(new long[] {80, -68, 16}, new long[] {1, 16, 188});
  }
}
