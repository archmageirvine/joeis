package irvine.oeis.a004;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a028.A028999;

/**
 * A004715 Positions of ones in binary expansion of arctan(1/2)/Pi.
 * @author Sean A. Irvine
 */
public class A004715 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A004715() {
    super(1, new A028999(), 1);
  }
}
