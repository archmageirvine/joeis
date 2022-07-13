package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a003.A003327;

/**
 * A057905 Positive integers that are not the sum of exactly four positive cubes.
 * @author Sean A. Irvine
 */
public class A057905 extends ComplementSequence {

  /** Construct the sequence. */
  public A057905() {
    super(new A003327(), Z.ONE);
  }
}
