package irvine.oeis.a007;

import irvine.oeis.InterleaveSequence;
import irvine.oeis.a000.A000151;
import irvine.oeis.a005.A005750;

/**
 * A007748 Number of self-converse oriented trees with n nodes.
 * @author Sean A. Irvine
 */
public class A007748 extends InterleaveSequence {

  /** Construct the sequence. */
  public A007748() {
    super(new A005750(), new A000151());
  }
}
