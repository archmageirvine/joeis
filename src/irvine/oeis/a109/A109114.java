package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109114 <code>a(n) = 5a(n-1) - 3a(n-2), a(0)=1, a(1)=6</code>.
 * @author Sean A. Irvine
 */
public class A109114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109114() {
    super(new long[] {-3, 5}, new long[] {1, 6});
  }
}
