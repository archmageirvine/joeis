package irvine.oeis.a057;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000959;
import irvine.oeis.a031.A031157;
import irvine.oeis.closure.PowerClosureSequence;

/**
 * A057609 Powers of a prime lucky number (A031157) but excluding lucky numbers (A000959).
 * @author Sean A. Irvine
 */
public class A057609 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A057609() {
    super(new PowerClosureSequence(new A031157()), new A000959());
  }
}
