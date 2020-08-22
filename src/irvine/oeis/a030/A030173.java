package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a007.A007921;

/**
 * A030173 Differences p(i)-p(j) between primes, sorted in numerical order.
 * @author Sean A. Irvine
 */
public class A030173 extends ComplementSequence {

  /** Construct the sequence. */
  public A030173() {
    super(new A007921(), Z.ONE);
  }
}
