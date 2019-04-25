package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242725 Sequence with all <code>(x, y) =</code> (a(2m), a(2m+-1)) satisfying x|y^2+y+1 and y|x^2+1.
 * @author Sean A. Irvine
 */
public class A242725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242725() {
    super(new long[] {1, -4, 0, 4}, new long[] {1, 1, 3, 10});
  }
}
