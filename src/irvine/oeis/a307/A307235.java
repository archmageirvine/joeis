package irvine.oeis.a307;
// Generated by gen_seq4.pl dex CR.SQRT2.add(CR.THREE.subtract(CR.THREE.multiply(CR.THREE.sqrt())).add(CR.PI).divide(CR.THREE).sqrt()) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A307235 Decimal expansion of sqrt(2) + sqrt((3-3*sqrt(3)+Pi)/3).
 * @author Georg Fischer
 */
public class A307235 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A307235() {
    super(CR.SQRT2.add(CR.THREE.subtract(CR.THREE.multiply(CR.THREE.sqrt())).add(CR.PI).divide(CR.THREE).sqrt()));
  }
}
