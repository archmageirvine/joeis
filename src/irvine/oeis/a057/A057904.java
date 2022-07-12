package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a003.A003072;

/**
 * A057904 Positive integers that are not the sum of exactly three positive cubes.
 * @author Sean A. Irvine
 */
public class A057904 extends ComplementSequence {

  /** Construct the sequence. */
  public A057904() {
    super(new A003072(), Z.ONE);
  }
}
