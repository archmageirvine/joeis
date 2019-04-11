package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112027 <code>a(1)=1</code>; then successively add 1, divide by 2, add 2 and then total up the last 4 terms.
 * @author Sean A. Irvine
 */
public class A112027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112027() {
    super(new long[] {-3, 0, 0, 0, 4, 0, 0, 0}, new long[] {1, 2, 1, 3, 7, 8, 4, 6});
  }
}
