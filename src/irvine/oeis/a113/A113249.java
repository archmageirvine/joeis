package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113249.
 * @author Sean A. Irvine
 */
public class A113249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113249() {
    super(new long[] {81, 36, 0, -4}, new long[] {-1, 4, 11, 1});
  }
}
