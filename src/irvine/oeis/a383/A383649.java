package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a206.A206369;

/**
 * A383649 Numbers k such that A206369(k) is prime.
 * @author Sean A. Irvine
 */
public class A383649 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A383649() {
    super(1, new A206369(), Z::isProbablePrime);
  }
}

