package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000041;

/**
 * A083711 a(n) = A083710(n) - A000041(n-1).
 * @author Sean A. Irvine
 */
public class A083711 extends Combiner {

  /** Construct the sequence. */
  public A083711() {
    super(1, new A083710().skip(2).prepend(2), new A000041(), Z::subtract);
  }
}
