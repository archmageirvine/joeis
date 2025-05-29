package irvine.oeis.a130;
// manually 2025-05-09/polya at 2025-05-28 11:39

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a001.A001764;
import irvine.oeis.a007.A007857;

/**
 * A130524 Diagonal immediately below the main diagonal of square array A130523.
 * new A007857(), new A000108(), new A001764()
 * @author Georg Fischer
 */
public class A130524 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A130524() {
    super(0, "[1]", "x,S,x,T,*,x,U,*", 0, 0, 1, 1, new A007857(), new A000108(), new A001764());
    next();
  }
}
