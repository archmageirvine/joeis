package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080782 <code>a(1)=1, a(n)=a(n-1)-1</code> if n is already in the sequence, <code>a(n)=a(n-1)+2</code> otherwise.
 * @author Sean A. Irvine
 */
public class A080782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080782() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 3, 2, 4});
  }
}
