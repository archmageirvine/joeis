package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A035035 Numbers k such that k &gt; d(k)^2, where d(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A035035 extends ComplementSequence {

  /** Construct the sequence. */
  public A035035() {
    super(new A035033(), Z.ONE);
  }
}
