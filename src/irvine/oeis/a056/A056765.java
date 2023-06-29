package irvine.oeis.a056;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A056765 Number of integers from A056757 (defined by A000005(x)^3 &gt; x) not exceeding 2^n.
 * @author Sean A. Irvine
 */
public class A056765 extends PrependSequence {

  /** Construct the sequence. */
  public A056765() {
    super(1, new PeriodicSequence(267), 0, 1, 3, 5, 8, 16, 21, 33, 52, 65, 90, 121, 143, 176, 204, 221, 245, 257, 263);
  }
}
