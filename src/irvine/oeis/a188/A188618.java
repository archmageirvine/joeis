package irvine.oeis.a188;
// Generated by gen_seq4.pl decexp at 2021-07-27 22:38

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;
/**
 * A188618 Decimal expansion of (diagonal)/(shortest side) of 1st electrum rectangle.
 * Formula: sqrt(2+(1/2)sqrt(3))
 * @author Georg Fischer
 */
public class A188618 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A188618() {
    super(1, CR.TWO.add(CR.HALF.multiply(CR.THREE.sqrt())).sqrt());
  }
}
