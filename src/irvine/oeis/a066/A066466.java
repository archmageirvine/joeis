package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066466 Numbers having just one anti-divisor.
 * @author Sean A. Irvine
 */
public class A066466 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066466() {
    super(1, new A066272(), Z.ONE::equals);
  }
}

