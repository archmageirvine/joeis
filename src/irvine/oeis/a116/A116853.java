package irvine.oeis.a116;
// Generated by gen_seq4.pl tricut1

import irvine.oeis.a068.A068106;
import irvine.oeis.triangle.TruncatedTriangle;

/**
 * A116853 Difference triangle of factorial numbers read by upward diagonals.
 * @author Georg Fischer
 */
public class A116853 extends TruncatedTriangle {

  /** Construct the sequence. */
  public A116853() {
    super(1, new A068106());
  }
}

