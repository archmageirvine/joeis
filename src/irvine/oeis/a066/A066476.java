package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066476 Numbers having just ten anti-divisors.
 * @author Sean A. Irvine
 */
public class A066476 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066476() {
    super(1, new A066272(), Z.TEN::equals);
  }
}

