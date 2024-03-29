package irvine.oeis.a240;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A240995 Decimal expansion of Pi^2/(12*log(2)*log(10)), a constant appearing in several contexts, namely, Khintchine-L\u00e9vy Constants, Gauss-Kuzmin distribution and Pell's equation.
 * @author Georg Fischer
 */
public class A240995 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A240995() {
    super(0, REALS.pow(CR.PI, CR.TWO).divide(CR.valueOf(12).multiply(CR.TWO.log()).multiply(CR.LOG10)));
  }
}
