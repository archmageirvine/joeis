package irvine.oeis.a158;
// manually deris/partprod at 2022-04-28 12:39

import irvine.oeis.PartialProductSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001093;

/**
 * A158621 Partial products of A001093.
 * @author Georg Fischer
 */
public class A158621 extends PartialProductSequence {

  /** Construct the sequence. */
  public A158621() {
    super(2, new SkipSequence(new A001093(), 3));
  }
}
