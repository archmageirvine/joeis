package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199491 <code>(11*7^n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A199491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199491() {
    super(new long[] {-7, 8}, new long[] {6, 39});
  }
}
