package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046984 Number of ways to tile a <code>4 X 3n</code> rectangle with right trominoes.
 * @author Sean A. Irvine
 */
public class A046984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046984() {
    super(new long[] {-4, -22, 10}, new long[] {1, 4, 18});
  }
}
