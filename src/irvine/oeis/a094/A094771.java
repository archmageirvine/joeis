package irvine.oeis.a094;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A094771 Decimal expansion of e^(e + Pi).
 * @author Georg Fischer
 */
public class A094771 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A094771() {
    super(3, REALS.pow(CR.E, CR.E.add(CR.PI)));
  }
}
