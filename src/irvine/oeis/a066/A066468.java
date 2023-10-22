package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066468 Numbers having just three anti-divisors.
 * @author Sean A. Irvine
 */
public class A066468 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066468() {
    super(1, new A066272(), Z.THREE::equals);
  }
}

