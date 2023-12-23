package irvine.oeis.a067;

import irvine.oeis.a000.A000586;
import irvine.oeis.a006.A006995;

/**
 * A067597 Number of partitions of n into distinct palindrome parts in base 2.
 * @author Sean A. Irvine
 */
public class A067597 extends A000586 {

  /** Construct the sequence. */
  public A067597() {
    super(new A006995().skip());
  }
}
