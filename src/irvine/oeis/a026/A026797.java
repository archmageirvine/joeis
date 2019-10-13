package irvine.oeis.a026;

import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008484;

/**
 * A026797 Number of partitions of n in which the least part is 4.
 * @author Sean A. Irvine
 */
public class A026797 extends PrependSequence {

  /** Construct the sequence. */
  public A026797() {
    super(new A008484(), 0, 0, 0);
  }
}
