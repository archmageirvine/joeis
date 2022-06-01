package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185452 Image of n under the map n -&gt; n/2 if n even, (5*n+1)/2 if n odd.
 * @author Sean A. Irvine
 */
public class A185452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185452() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 3, 1, 8});
  }
}
