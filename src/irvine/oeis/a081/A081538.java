package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Combiner;

/**
 * A081538 a(n) = A081537(n)/A081535(n), with a(2) = 1 by convention.
 * @author Sean A. Irvine
 */
public class A081538 extends Combiner {

  /** Construct the sequence. */
  public A081538() {
    super(1, new A081537(), new A081535(), (x, y) -> x.isZero() ? Z.ONE : x.divide(y));
  }
}
