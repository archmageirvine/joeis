package irvine.oeis.a095;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000796;

/**
 * A095916 Differences between adjacent digits of <code>Pi</code>.
 * @author Sean A. Irvine
 */
public class A095916 extends DifferenceSequence {

  /** Construct the sequence. */
  public A095916() {
    super(new A000796());
  }
}

