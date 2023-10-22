package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066469 Numbers having exactly four anti-divisors.
 * @author Sean A. Irvine
 */
public class A066469 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066469() {
    super(1, new A066272(), Z.FOUR::equals);
  }
}

