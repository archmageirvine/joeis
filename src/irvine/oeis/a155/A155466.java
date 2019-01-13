package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155466.
 * @author Sean A. Irvine
 */
public class A155466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155466() {
    super(new long[] {1, -7, 7}, new long[] {28, 207, 1248});
  }
}
