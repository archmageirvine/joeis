package irvine.oeis.a067;

import irvine.oeis.a006.A006995;
import irvine.oeis.transform.RationalProductTransform;

/**
 * A067597 Number of partitions of n into distinct palindrome parts in base 2.
 * @author Sean A. Irvine
 */
public class A067597 extends RationalProductTransform {

  /** Construct the sequence. */
  public A067597() {
    super(0, new Builder().f(-1).g(-1).h(new A006995().skip()));
  }
}
