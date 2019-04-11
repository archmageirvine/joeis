package irvine.oeis.a167;

import irvine.oeis.FiniteSequence;

/**
 * A167981 Number of 2n-cycles on the graph of the tesseract, <code>2 &lt;= n &lt;= 8</code>.
 * @author Georg Fischer
 */
public class A167981 extends FiniteSequence {

  /** Construct the sequence. */
  public A167981() {
    super(24, 128, 696, 2112, 5024, 5736, 1344);
  }
}
