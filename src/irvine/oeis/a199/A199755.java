package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199755 <code>5*11^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199755() {
    super(new long[] {-11, 12}, new long[] {6, 56});
  }
}
