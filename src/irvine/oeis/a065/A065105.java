package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A065084.
 * @author Sean A. Irvine
 */
public class A065105 extends ComplementSequence {

  /** Construct the sequence. */
  public A065105() {
    super(1, new A065108(), Z.ONE);
  }
}
