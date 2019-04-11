package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122653 <code>a(n) = 10*a(n-1) - a(n-2)</code> with <code>a(0)=0, a(1)=6</code>.
 * @author Sean A. Irvine
 */
public class A122653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122653() {
    super(new long[] {-1, 10}, new long[] {0, 6});
  }
}
