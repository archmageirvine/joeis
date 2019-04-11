package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168090 <code>a(n) = (1 - (n mod 3) mod 2)*2^(floor(n/3) + (n mod 3)/2 )</code>.
 * @author Sean A. Irvine
 */
public class A168090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168090() {
    super(new long[] {2, 0, 0}, new long[] {1, 0, 2});
  }
}
