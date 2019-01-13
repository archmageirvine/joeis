package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130785.
 * @author Sean A. Irvine
 */
public class A130785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130785() {
    super(new long[] {2, -3, 3}, new long[] {1, 4, 9});
  }
}
