package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a001.A001983;

/**
 * A004435 Positive integers that are not the sum of 2 distinct square integers.
 * @author Sean A. Irvine
 */
public class A004435 extends ComplementSequence {

  /** Construct the sequence. */
  public A004435() {
    super(Z.TWO, new A001983());
  }
}
