package irvine.oeis.a074;
// manually partprom/partprod at 2022-04-12

import irvine.oeis.PartialProductSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002113;

/**
 * A074166 Product of first n palindromes.
 * @author Georg Fischer
 */
public class A074166 extends PartialProductSequence {

  /** Construct the sequence. */
  public A074166() {
    super(1, new SkipSequence(new A002113(), 1));
  }
}
