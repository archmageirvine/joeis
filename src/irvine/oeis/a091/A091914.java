package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091914 <code>a(n) = 2*a(n-1) + 12*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A091914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091914() {
    super(new long[] {12, 2}, new long[] {1, 2});
  }
}
