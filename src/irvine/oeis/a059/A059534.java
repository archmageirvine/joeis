package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.BeattySequence;

/**
 * A059534 Beatty sequence for 1 + 1/Catalan's constant.
 * @author Sean A. Irvine
 */
public class A059534 extends BeattySequence {

  /** Construct the sequence. */
  public A059534() {
    super(1, new A006752().getCR().inverse().add(CR.ONE));
  }
}
