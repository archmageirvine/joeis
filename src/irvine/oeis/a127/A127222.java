package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127222 <code>a(n) = 3^n*pentanacci(n)</code> or (3^n)*A023424(n-1).
 * @author Sean A. Irvine
 */
public class A127222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127222() {
    super(new long[] {243, 81, 27, 9, 3}, new long[] {3, 27, 189, 1215, 7533});
  }
}
