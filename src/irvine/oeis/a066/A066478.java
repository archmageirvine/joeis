package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066478 Numbers having just twelve anti-divisors.
 * @author Sean A. Irvine
 */
public class A066478 extends FilterPositionSequence {

  private static final Z TWELVE = Z.valueOf(12);

  /** Construct the sequence. */
  public A066478() {
    super(1, new A066272(), TWELVE::equals);
  }
}

