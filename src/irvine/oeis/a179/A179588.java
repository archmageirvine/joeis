package irvine.oeis.a179;
// Generated by gen_seq4.pl decexp at 2021-07-13 19:05

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A179588 Decimal expansion of the surface area of square cupola with edge length 1.
 * @author Georg Fischer
 */
public class A179588 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A179588() {
    super(2, CR.SEVEN.add(CR.TWO.multiply(CR.TWO.sqrt())).add(CR.THREE.sqrt()));
  }
}
