package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a001.A001358;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A074985 Squares of semiprimes (A001358).
 * @author Sean A. Irvine
 */
public class A074985 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A074985() {
    super(1, new A001358(), Z::square);
  }
}
