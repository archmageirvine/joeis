package irvine.oeis.a064;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a059.A059590;
import irvine.oeis.a060.A060132;

/**
 * A064637 Setwise difference of A060132 and A059590. Those terms of A060132 which are not representable as a sum of distinct factorials.
 * @author Sean A. Irvine
 */
public class A064637 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A064637() {
    super(0, new A060132(), new A059590());
  }
}
