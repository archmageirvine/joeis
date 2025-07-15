package irvine.oeis.a384;

import irvine.oeis.Combiner;
import irvine.oeis.a118.A118704;

/**
 * A384596 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A384596 extends Combiner {

  /** Construct the sequence. */
  public A384596() {
    super(1, new A118704(), new A384594().skip(), (a, b) -> a.add(b).divide2());
  }
}

