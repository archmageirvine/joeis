package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090731 <code>a(n) = 23a(n-1) - a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 23</code>.
 * @author Sean A. Irvine
 */
public class A090731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090731() {
    super(new long[] {-1, 23}, new long[] {2, 23});
  }
}
