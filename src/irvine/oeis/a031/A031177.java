package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a007.A007770;

/**
 * A031177 Unhappy numbers: numbers having <code>period-8 2-digitized</code> sequences.
 * @author Sean A. Irvine
 */
public class A031177 extends ComplementSequence {

  /** Construct the sequence. */
  public A031177() {
    super(new A007770(), Z.TWO);
  }
}
