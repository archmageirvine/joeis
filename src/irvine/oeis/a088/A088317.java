package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088317 <code>a(n) = 8*a(n-1) + a(n-2)</code>, starting with <code>a(0) = 1</code> and <code>a(1) = 4</code>.
 * @author Sean A. Irvine
 */
public class A088317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088317() {
    super(new long[] {1, 8}, new long[] {1, 4});
  }
}
