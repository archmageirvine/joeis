package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138148 Cyclops numbers with binary digits only.
 * @author Sean A. Irvine
 */
public class A138148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138148() {
    super(new long[] {1000, -1110, 111}, new long[] {0, 101, 11011});
  }
}
