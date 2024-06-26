package irvine.oeis.a058;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A058455 Numbers k such that k^2 contains only digits {0,8,9}, not ending with zero.
 *
 * @author Georg Fischer
 */
public class A058455 extends BriefSequence {

  /** Construct the sequence. */
  public A058455() {
    super(1, BRIEF, Z.THREE, new Z("283"), new Z("301345331969667"),
      new Z("299831600904572582192518303"));
  }
}
