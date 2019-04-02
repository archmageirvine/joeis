package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041756 Numerators of continued fraction convergents to sqrt(398).
 * @author Sean A. Irvine
 */
public class A041756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041756() {
    super(new long[] {-1, 0, 0, 0, 798, 0, 0, 0}, new long[] {19, 20, 379, 399, 15541, 15940, 302461, 318401});
  }
}
