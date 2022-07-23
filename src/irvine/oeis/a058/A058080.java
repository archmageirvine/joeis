package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a007.A007964;

/**
 * A058080 Numbers whose product of divisors exceeds their square.
 * @author Sean A. Irvine
 */
public class A058080 extends ComplementSequence {

  /** Construct the sequence. */
  public A058080() {
    super(new A007964(), Z.ONE);
  }
}

