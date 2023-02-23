package irvine.oeis.a182;
// manually egypfr at 2023-02-23 11:27

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;
import irvine.oeis.PrependSequence;

/**
 * A182257 Denominators of Egyptian fraction expansion of Pi.
 * @author Georg Fischer
 */
public class A182257 extends PrependSequence {

  /** Construct the sequence. */
  public A182257() {
    super(1, new EgyptianFractionSequence(CR.PI), 1, 1, 1);
  }
}
