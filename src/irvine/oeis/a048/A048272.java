package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.transform.InverseMobiusTransformSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A048272 Number of odd divisors of n minus number of even divisors of n.
 * @author Sean A. Irvine
 */
public class A048272 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A048272() {
    super(new PeriodicSequence(1, -1), 0, Z.ONE);
    next();
  }
}

