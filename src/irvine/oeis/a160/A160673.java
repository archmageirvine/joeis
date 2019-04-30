package irvine.oeis.a160;

import irvine.oeis.FiniteSequence;

/**
 * A160673 a(n)=smallest n-digit prime formed by appending a digit to <code>a(n-1); a(7)=8402963</code>.
 * @author Georg Fischer
 */
public class A160673 extends FiniteSequence {

  /** Construct the sequence. */
  public A160673() {
    super(8402963, 84029633, 840296333L, 8402963339L, 84029633399L, 840296333999L, 8402963339993L, 84029633399939L, 840296333999393L, 8402963339993933L);
  }
}
