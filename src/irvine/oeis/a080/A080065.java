package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A080065 Numbers k such that k == 3 modulo (lpf(k)+1), where lpf(k) is the least prime dividing k (A020639).
 * @author Sean A. Irvine
 */
public class A080065 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A080065() {
    super(1, new A080063(), Z.THREE::equals);
  }
}
