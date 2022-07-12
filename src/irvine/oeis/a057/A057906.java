package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a003.A003328;

/**
 * A057906 Positive integers that are not the sum of exactly five positive cubes.
 * @author Sean A. Irvine
 */
public class A057906 extends ComplementSequence {

  /** Construct the sequence. */
  public A057906() {
    super(new A003328(), Z.ONE);
  }
}
