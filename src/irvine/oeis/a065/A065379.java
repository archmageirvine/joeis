package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A065379 Palindromic squares with a prime root.
 * @author Sean A. Irvine
 */
public class A065379 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A065379() {
    super(new A065378(), Z::square);
  }
}
