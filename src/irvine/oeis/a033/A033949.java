package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A033949 Positive integers that do not have a primitive root.
 * @author Sean A. Irvine
 */
public class A033949 extends ComplementSequence {

  /** Construct the sequence. */
  public A033949() {
    super(new A033948(), Z.EIGHT);
  }
}
