package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155641.
 * @author Sean A. Irvine
 */
public class A155641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155641() {
    super(new long[] {40, -53, 14}, new long[] {1, 4, 40});
  }
}
