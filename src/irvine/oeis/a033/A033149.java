package irvine.oeis.a033;

import irvine.oeis.PositionOfNSequence;
import irvine.oeis.a002.A002852;

/**
 * A033149 Position of first occurrence of n in the continued fraction for the Euler-Mascheroni constant (gamma).
 * @author Sean A. Irvine
 */
public class A033149 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A033149() {
    super(new A002852(), 1);
  }
}
