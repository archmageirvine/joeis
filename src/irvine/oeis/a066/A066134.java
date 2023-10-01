package irvine.oeis.a066;

import irvine.oeis.FilterSequence;

/**
 * A066134 Numbers from A066112 that are neither square nor twice a square, i.e., are not in A028982 but are in A028983.
 * @author Sean A. Irvine
 */
public class A066134 extends FilterSequence {

  /** Construct the sequence. */
  public A066134() {
    super(1, new A066112(), k -> !k.isSquare() && (k.isOdd() || !k.divide2().isSquare()));
  }
}
