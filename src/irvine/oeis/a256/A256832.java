package irvine.oeis.a256;
// manually partprom/partprod at 2022-04-12 13:38

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a000.A000129;

/**
 * A256832 Product of first n Pell numbers Pell(1), ... , Pell(n).
 * @author Georg Fischer
 */
public class A256832 extends PartialProductSequence {

  /** Construct the sequence. */
  public A256832() {
    super(1, new A000129().skip(1));
  }
}
