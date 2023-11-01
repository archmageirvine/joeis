package irvine.oeis.a066;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000010;

/**
 * A066669 Numbers n such that phi(n) = 2^k*prime for some k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A066669 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066669() {
    super(1, new A000010(), k -> k.makeOdd().isProbablePrime());
  }
}
