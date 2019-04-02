package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122690 a(0)=1, a(1)=4, a(n)=5*a(n-1)+4*a(n-2) for n&gt;1.
 * @author Sean A. Irvine
 */
public class A122690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122690() {
    super(new long[] {4, 5}, new long[] {1, 4});
  }
}
