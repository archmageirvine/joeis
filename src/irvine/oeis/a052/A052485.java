package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a001.A001694;

/**
 * A052485 Weak numbers (i.e., not powerful (1)): there is a prime p where p|n is true but p^2|n is not true.
 * @author Sean A. Irvine
 */
public class A052485 extends ComplementSequence {

  /** Construct the sequence. */
  public A052485() {
    super(new A001694(), Z.TWO);
  }
}
