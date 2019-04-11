package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024016 <code>2^n-n^6</code>.
 * @author Sean A. Irvine
 */
public class A024016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024016() {
    super(new long[] {-2, 15, -49, 91, -105, 77, -35, 9}, new long[] {1, 1, -60, -721, -4080, -15593, -46592, -117521});
  }
}
