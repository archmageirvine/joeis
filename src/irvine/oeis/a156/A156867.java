package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156867 <code>729000n - 180</code>.
 * @author Sean A. Irvine
 */
public class A156867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156867() {
    super(new long[] {-1, 2}, new long[] {728820, 1457820});
  }
}
