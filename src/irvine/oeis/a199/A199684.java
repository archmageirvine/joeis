package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199684 <code>4*10^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199684() {
    super(new long[] {-10, 11}, new long[] {5, 41});
  }
}
