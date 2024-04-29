package irvine.oeis.a014;

import irvine.oeis.FilterSequence;
import irvine.oeis.a063.A063691;

/**
 * A014465 A063691 without zeros.
 * @author Sean A. Irvine
 */
public class A014465 extends FilterSequence {

  /** Construct the sequence. */
  public A014465() {
    super(1, new A063691(), NONZERO);
  }
}
