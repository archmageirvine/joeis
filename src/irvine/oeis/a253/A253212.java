package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253212 <code>a(n) = 9^n + 8</code>.
 * @author Sean A. Irvine
 */
public class A253212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253212() {
    super(new long[] {-9, 10}, new long[] {9, 17});
  }
}
