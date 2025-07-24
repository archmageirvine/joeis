package irvine.oeis.a386;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000013;
import irvine.oeis.a003.A003239;

/**
 * A386388 allocated for Tilman Piesk.
 * @author Sean A. Irvine
 */
public class A386388 extends Combiner {

  /** Construct the sequence. */
  public A386388() {
    super(0, new A003239(), new A000013(), (a, b) -> a.subtract(b).divide2());
  }
}

