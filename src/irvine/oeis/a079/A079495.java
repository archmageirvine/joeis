package irvine.oeis.a079;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006287;

/**
 * A079495 Numbers k such that the sum of the squares of the digits of k in base 3 is 0 (mod 3).
 * @author Sean A. Irvine
 */
public class A079495 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A079495() {
    super(1, 0, new A006287(), k -> k.mod(3) == 0);
  }
}
