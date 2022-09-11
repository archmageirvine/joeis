package irvine.oeis.a059;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000961;

/**
 * A059047 Numbers x such that sigma(x)-x divides x-1, other than prime powers.
 * @author Sean A. Irvine
 */
public class A059047 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A059047() {
    super(new A059046(), new A000961());
  }
}
