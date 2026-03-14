package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084140 a(n) is the smallest number j such that if x &gt;= j there are at least n primes between x and 2x exclusively.
 * @author Sean A. Irvine
 */
public class A084140 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084140() {
    super(1, new A084139(), Z.ONE::add);
  }
}

