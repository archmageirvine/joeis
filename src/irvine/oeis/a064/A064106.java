package irvine.oeis.a064;

import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000930;

/**
 * A064106 3rd column of 3rd-order Zeckendorf array.
 * @author Sean A. Irvine
 */
public class A064106 extends A064105 {

  /** Construct the sequence. */
  public A064106() {
    super(new SkipSequence(new A000930(), 4), 3);
  }
}
