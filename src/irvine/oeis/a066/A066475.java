package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066475 Numbers having just nine anti-divisors.
 * @author Sean A. Irvine
 */
public class A066475 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066475() {
    super(1, new A066272(), Z.NINE::equals);
  }
}

