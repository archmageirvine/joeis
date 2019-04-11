package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218739 <code>a(n) = (36^n-1)/35</code>.
 * @author Sean A. Irvine
 */
public class A218739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218739() {
    super(new long[] {-36, 37}, new long[] {0, 1});
  }
}
