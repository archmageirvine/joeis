package irvine.oeis.a014;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a001.A001468;

/**
 * A014677 First differences of <code>A001468</code>.
 * @author Sean A. Irvine
 */
public class A014677 extends DifferenceSequence {

  /** Construct the sequence. */
  public A014677() {
    super(new A001468());
  }
}

