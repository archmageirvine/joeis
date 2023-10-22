package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066473 Numbers having just seven anti-divisors.
 * @author Sean A. Irvine
 */
public class A066473 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066473() {
    super(1, new A066272(), Z.SEVEN::equals);
  }
}

