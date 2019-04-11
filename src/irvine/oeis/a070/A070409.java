package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070409 <code>a(n) = 7^n mod 23</code>.
 * @author Sean A. Irvine
 */
public class A070409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070409() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 7, 3, 21, 9, 17, 4, 5, 12, 15, 13, 22});
  }
}
