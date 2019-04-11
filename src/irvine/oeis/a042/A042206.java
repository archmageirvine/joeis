package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042206 Numerators of continued fraction convergents to <code>sqrt(629)</code>.
 * @author Sean A. Irvine
 */
public class A042206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042206() {
    super(new long[] {1, 0, 0, 0, 0, 15700, 0, 0, 0, 0}, new long[] {25, 301, 326, 627, 7850, 393127, 4725374, 5118501, 9843875, 123245001});
  }
}
