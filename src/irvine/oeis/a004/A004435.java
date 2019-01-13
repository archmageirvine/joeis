package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a001.A001983;

/**
 * A004435.
 * @author Sean A. Irvine
 */
public class A004435 extends ComplementSequence {

  /** Construct the sequence. */
  public A004435() {
    super(new A001983(), Z.TWO);
  }
}
