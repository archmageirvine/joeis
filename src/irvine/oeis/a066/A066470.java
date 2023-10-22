package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066470 Numbers having just five anti-divisors.
 * @author Sean A. Irvine
 */
public class A066470 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066470() {
    super(1, new A066272(), Z.FIVE::equals);
  }
}

