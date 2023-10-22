package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066472 Numbers having exactly six anti-divisors.
 * @author Sean A. Irvine
 */
public class A066472 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066472() {
    super(1, new A066272(), Z.SIX::equals);
  }
}

