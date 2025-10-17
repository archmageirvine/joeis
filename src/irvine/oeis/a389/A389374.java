package irvine.oeis.a389;

import irvine.oeis.SetDifferenceSequence;

/**
 * A389374 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A389374 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A389374() {
    super(1, new A389226(), new A389260());
  }
}
