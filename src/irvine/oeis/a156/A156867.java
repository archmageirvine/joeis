package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156867 a(n) = 729000*n - 180.
 * @author Sean A. Irvine
 */
public class A156867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156867() {
    super(1, new long[] {-1, 2}, new long[] {728820, 1457820});
  }
}
