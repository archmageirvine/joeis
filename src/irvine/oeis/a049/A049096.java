package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A049096 Numbers k such that 2^k + 1 is divisible by a square &gt; 1.
 * @author Sean A. Irvine
 */
public class A049096 extends ComplementSequence {

  /** Construct the sequence. */
  public A049096() {
    super(new A049095(), Z.ONE);
  }
}
