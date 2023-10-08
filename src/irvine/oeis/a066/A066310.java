package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A066310 n &lt; (product of digits of n) * (sum of digits of n).
 * @author Sean A. Irvine
 */
public class A066310 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066310() {
    super(1, 1, new A066308(), (k, v) -> Z.valueOf(k).compareTo(v) < 0);
  }
}

