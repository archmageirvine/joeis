package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A049094 Numbers m such that 2^m - 1 is divisible by a square &gt; 1.
 * @author Sean A. Irvine
 */
public class A049094 extends ComplementSequence {

  /** Construct the sequence. */
  public A049094() {
    super(new A049093(), Z.ONE);
  }
}
