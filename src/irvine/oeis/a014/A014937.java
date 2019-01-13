package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014937.
 * @author Sean A. Irvine
 */
public class A014937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014937() {
    super(new long[] {400, -440, 41}, new long[] {1, 41, 1241});
  }
}
