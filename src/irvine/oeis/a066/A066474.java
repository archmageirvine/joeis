package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066474 Numbers having just eight anti-divisors.
 * @author Sean A. Irvine
 */
public class A066474 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066474() {
    super(1, new A066272(), Z.EIGHT::equals);
  }
}

