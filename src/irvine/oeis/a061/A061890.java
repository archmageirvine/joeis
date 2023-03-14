package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007504;

/**
 * A061890 Squares that are the sum of initial primes.
 * @author Georg Fischer
 */
public class A061890 extends FilterSequence {

  /** Construct the sequence. */
  public A061890() {
    super(1, new A007504(), Z::isSquare);
    next();
  }
}
