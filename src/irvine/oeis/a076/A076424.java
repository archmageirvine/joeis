package irvine.oeis.a076;

import irvine.oeis.InverseSequence;

/**
 * A076424 Smallest number that requires n steps to reach 0 when iterating the mapping k -&gt; abs(reverse(lpd(k))-reverse(Lpf(k))). lpd(k) is the largest proper divisor and Lpf(k) is the largest prime factor of k.
 * @author Sean A. Irvine
 */
public class A076424 extends InverseSequence {

  /** Construct the sequence. */
  public A076424() {
    super(1, new A076423(), 1);
  }
}
