package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002034;

/**
 * A073582 Numbers k such that S(k) = k/2, where S(k) is the Kempner function A002034.
 * @author Sean A. Irvine
 */
public class A073582 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073582() {
    super(1, 1, new A002034(), (n, k) -> k.multiply2().equals(Z.valueOf(n)));
  }
}
