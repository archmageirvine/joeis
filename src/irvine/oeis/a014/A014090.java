package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A014090 Numbers that are not the sum of a square and a prime.
 * @author Sean A. Irvine
 */
public class A014090 extends ComplementSequence {

  /** Construct the sequence. */
  public A014090() {
    super(new A014089(), Z.ONE);
  }
}
