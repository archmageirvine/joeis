package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241872 Number of ascent sequences of length n with exactly two descents.
 * @author Sean A. Irvine
 */
public class A241872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241872() {
    super(5, new long[] {288, -984, 1388, -1054, 467, -121, 17}, new long[] {4, 53, 429, 2748, 15342, 78339, 376159});
  }
}
