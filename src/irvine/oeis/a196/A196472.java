package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196472 a(1)=1; a(n) = floor((3 + sqrt(21))*a(n-1)/2) for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A196472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196472() {
    super(new long[] {-3, 0, 4}, new long[] {1, 3, 11});
  }
}
