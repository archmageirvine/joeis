package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002965 Interleave denominators (A000129) and numerators (A001333) of convergents to sqrt(2).
 * @author Sean A. Irvine
 */
public class A002965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002965() {
    super(new long[] {1, 0, 2, 0}, new long[] {0, 1, 1, 1});
  }
}
