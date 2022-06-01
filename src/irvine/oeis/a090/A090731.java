package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090731 a(n) = 23a(n-1) - a(n-2), starting with a(0) = 2 and a(1) = 23.
 * @author Sean A. Irvine
 */
public class A090731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090731() {
    super(new long[] {-1, 23}, new long[] {2, 23});
  }
}
