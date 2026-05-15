package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a265.A265388;

/**
 * A395746 Numbers m such that A265388(m) = A007947(m*(2*m-1)).
 * @author Sean A. Irvine
 */
public class A395746 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A395746() {
    super(1, 1, new A265388(), (n, k) -> k.equals(Functions.RAD.z(n * (2 * n - 1))));
  }
}
