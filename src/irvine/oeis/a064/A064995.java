package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.oeis.a002.A002210;
import irvine.oeis.cons.BeattySequence;

/**
 * A064995 A Beatty sequence from Khintchin's constant (A002210).
 * @author Sean A. Irvine
 */
public class A064995 extends BeattySequence {

  private static CR build() {
    final CR k = new A002210().getCR();
    return k.subtract(CR.ONE).divide(k.subtract(CR.TWO));
  }

  /** Construct the sequence. */
  public A064995() {
    super(1, build());
  }
}
