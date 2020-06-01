package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062318 Numbers of the form <code>3^m - 1</code> or <code>2*3^m - 1;</code> i.e., the union of sequences <code>A048473</code> and <code>A024023</code>.
 * @author Sean A. Irvine
 */
public class A062318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062318() {
    super(new long[] {-3, 3, 1}, new long[] {0, 1, 2});
  }
}
