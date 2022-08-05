package irvine.oeis.a058;

import irvine.oeis.SkipSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000079;
import irvine.oeis.a100.A100484;

/**
 * A058363 Numbers whose reduced system of residues forms an arithmetic progression. It consists of primes, twice primes, and powers of 2.
 * @author Sean A. Irvine
 */
public class A058363 extends UnionSequence {

  /** Construct the sequence. */
  public A058363() {
    super(new A000040(), new A100484(), new SkipSequence(new A000079(), 1));
  }
}
