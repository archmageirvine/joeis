package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054324.
 * @author Sean A. Irvine
 */
public class A054324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054324() {
    super(new long[] {-4096, 6144, -3840, 1280, -240, 24}, new long[] {6, 224, 4032, 50688, 512512, 4472832});
  }
}
