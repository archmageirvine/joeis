package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A062514 Numbers k such that sigma(phi(k)) is a prime.
 * @author Sean A. Irvine
 */
public class A062514 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A062514() {
    super(1, 1, new A062402(), Z::isProbablePrime);
  }
}
