package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196792 <code>a(n)=T(10,n)</code>, array T given by <code>A047848</code>.
 * @author Sean A. Irvine
 */
public class A196792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196792() {
    super(new long[] {-13, 14}, new long[] {1, 2});
  }
}
