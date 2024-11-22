package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002034;

/**
 * A073284.
 * @author Sean A. Irvine
 */
public class A073307 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073307() {
    super(1, 1, new A002034(), (n, k) -> k.equals(Functions.SIGMA0.z(n)));
  }
}

