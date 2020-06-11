package irvine.oeis.a188;
// Generated by gen_seq4.pl dex CR.THREE.add(CR.valueOf(109).sqrt()).divide(CR.TEN) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A188729 Decimal expansion of <code>(3+sqrt(109))/10</code>.
 * @author Georg Fischer
 */
public class A188729 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.add(CR.valueOf(109).sqrt()).divide(CR.TEN);

  @Override
  protected CR getCR() {
    return N;
  }
}
