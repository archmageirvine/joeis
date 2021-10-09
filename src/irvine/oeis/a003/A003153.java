package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.oeis.cons.RoundingBeattySequence;

/**
 * A003153 a(n) = integer nearest n*(1+sqrt(2)).
 * @author Sean A. Irvine
 */
public class A003153 extends RoundingBeattySequence {

  /** Construct the sequence. */
  public A003153() {
    super(1, CR.SQRT2.add(CR.ONE));
  }
}
