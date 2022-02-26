package irvine.oeis.a054;

import irvine.oeis.PositionOfNSequence;
import irvine.oeis.SkipSequence;

/**
 * A054845.
 * @author Sean A. Irvine
 */
public class A054859 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A054859() {
    super(new SkipSequence(new A054845(), 1), 0);
  }
}
