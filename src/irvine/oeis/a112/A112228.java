package irvine.oeis.a112;
// manually partprom/partprod at 2022-04-12 12:36

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a186.A186621;

/**
 * A112228 Product of the first n (semiprimes - 1).
 * @author Georg Fischer
 */
public class A112228 extends PartialProductSequence {

  /** Construct the sequence. */
  public A112228() {
    super(new A186621());
  }
}
