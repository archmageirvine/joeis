package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228843 <code>a(n) =</code> 4^n*A228842(n).
 * @author Sean A. Irvine
 */
public class A228843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228843() {
    super(new long[] {-64, 24}, new long[] {2, 24});
  }
}
