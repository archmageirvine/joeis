package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259162 Positive hexagonal numbers <code>(A000384)</code> that are pentagonal numbers <code>(A000326)</code> divided by 2.
 * @author Sean A. Irvine
 */
public class A259162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259162() {
    super(new long[] {1, -9603, 9603}, new long[] {6, 58311, 559902916});
  }
}
