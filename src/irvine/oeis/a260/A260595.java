package irvine.oeis.a260;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A260595 The binary expansion of log(3)/log(2).
 * @author Georg Fischer
 */
public class A260595 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A260595() {
    super(1, CR.THREE.log().divide(CR.TWO.log()), 2);
  }
}
