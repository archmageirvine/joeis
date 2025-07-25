package irvine.oeis.a386;

import irvine.oeis.Combiner;
import irvine.oeis.a046.A046737;
import irvine.oeis.a046.A046738;

/**
 * A386236 Ratio of the period and the reduced period of the Fibonacci 3-step sequence A000073 mod n.
 * @author Sean A. Irvine
 */
public class A386236 extends Combiner {

  /** Construct the sequence. */
  public A386236() {
    super(1, new A046738(), new A046737(), DIVIDE);
  }
}
