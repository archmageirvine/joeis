package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A022844 <code>a(n) = floor(n*Pi)</code>.
 * @author Sean A. Irvine
 */
public class A022844 extends BeattySequence {

  /** Construct the sequence. */
  public A022844() {
    super(0);
  }

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
