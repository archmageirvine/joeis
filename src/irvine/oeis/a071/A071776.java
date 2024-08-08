package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001175;

/**
 * A071771.
 * @author Sean A. Irvine
 */
public class A071776 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071776() {
    super(1, 1, new A001175(), (n, k) -> k.equals(Z.valueOf(3L * (n + 2))));
  }
}
