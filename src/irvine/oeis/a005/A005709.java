package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005709 <code>a(n) = a(n-1) + a(n-7),</code> with a(i) <code>= 1</code> for i <code>= 0</code>..6.
 * @author Sean A. Irvine
 */
public class A005709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005709() {
    super(new long[] {1, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}

