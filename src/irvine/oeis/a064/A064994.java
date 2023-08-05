package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.oeis.a002.A002210;
import irvine.oeis.cons.BeattySequence;

/**
 * A064994 A Beatty sequence from Khintchine's constant (A002210).
 * @author Sean A. Irvine
 */
public class A064994 extends BeattySequence {

  /** Construct the sequence. */
  public A064994() {
    super(1, new A002210().getCR().subtract(CR.ONE));
  }
}
