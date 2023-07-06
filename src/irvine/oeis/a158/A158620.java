package irvine.oeis.a158;
// manually deris/partprod at 2022-04-28 12:39

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a068.A068601;

/**
 * A158620 Partial products of A068601.
 * @author Georg Fischer
 */
public class A158620 extends PartialProductSequence {

  /** Construct the sequence. */
  public A158620() {
    super(2, new A068601().skip(1));
  }
}
