package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027971.
 * @author Sean A. Irvine
 */
public class A027971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027971() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {3, 7, 18, 47, 123, 319, 806, 1954, 4506, 9859});
  }
}
