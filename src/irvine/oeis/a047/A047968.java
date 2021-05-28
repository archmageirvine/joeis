package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.InverseMobiusTransformSequence;
import irvine.oeis.a000.A000041;

/**
 * A047968 a(n) = Sum_{d|n} p(d), where p(d) = A000041 = number of partitions of d.
 * @author Sean A. Irvine
 */
public class A047968 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A047968() {
    super(new A000041(), 1, Z.ONE);
    next();
  }
}
