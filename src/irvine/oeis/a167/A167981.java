package irvine.oeis.a167;

import irvine.oeis.FiniteSequence;

/**
 * A167981 Number of 2n-cycles on the graph of the tesseract, 2 &lt;= n &lt;= 8.
 * @author Georg Fischer
 */
public class A167981 extends FiniteSequence {

  /** Construct the sequence. */
  public A167981() {
    super(2, FINITE, 24, 128, 696, 2112, 5024, 5736, 1344);
  }
}
