package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066309 Numbers k such that k &gt; (product of digits of k) * (sum of digits of k).
 * @author Sean A. Irvine
 */
public class A066309 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066309() {
    super(1, 1, new A066308(), (k, v) -> Z.valueOf(k).compareTo(v) > 0);
  }
}

