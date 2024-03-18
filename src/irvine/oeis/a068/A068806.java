package irvine.oeis.a068;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002858;

/**
 * A068806 Ulam numbers that are powers of 2.
 * @author Sean A. Irvine
 */
public class A068806 extends FilterSequence {

  /** Construct the sequence. */
  public A068806() {
    super(1, new A002858(), POWER2);
  }
}
