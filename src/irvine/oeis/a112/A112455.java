package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112455 a(n) = -a(n-2)-a(n-3).
 * @author Sean A. Irvine
 */
public class A112455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112455() {
    super(new long[] {-1, -1, 0}, new long[] {-3, 0, 2});
  }
}
