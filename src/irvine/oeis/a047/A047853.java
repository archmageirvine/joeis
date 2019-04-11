package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047853 <code>a(n) =</code> T(5,n), array T given by A047848.
 * @author Sean A. Irvine
 */
public class A047853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047853() {
    super(new long[] {-8, 9}, new long[] {1, 2});
  }
}
