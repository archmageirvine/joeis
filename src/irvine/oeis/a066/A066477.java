package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066477 Numbers having just eleven anti-divisors.
 * @author Sean A. Irvine
 */
public class A066477 extends FilterPositionSequence {

  private static final Z ELEVEN = Z.valueOf(11);

  /** Construct the sequence. */
  public A066477() {
    super(1, new A066272(), ELEVEN::equals);
  }
}

