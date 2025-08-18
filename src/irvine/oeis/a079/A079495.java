package irvine.oeis.a079;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006287;

/**
 * A079495 Let b=3. Sum of squares of digits in base b gives 0 (mod b).
 * @author Sean A. Irvine
 */
public class A079495 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A079495() {
    super(1, 0, new A006287(), k -> k.mod(3) == 0);
  }
}
