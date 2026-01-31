package irvine.oeis.a174;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a022.A022004;

/**
 * A174858 Primes p such that p + 2, p + 6, and the concatenation p (p+2) (p+6) is prime.
 * @author Sean A. Irvine
 */
public class A174858 extends FilterSequence {

  /** Construct the sequence. */
  public A174858() {
    super(new A022004(), p -> new Z(p.toString() + p.add(2).toString() + p.add(6).toString()).isProbablePrime());
  }
}
