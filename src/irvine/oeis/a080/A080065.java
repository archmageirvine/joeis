package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A080065 Numbers n such that n == 3 modulo (spf(n)+1), where spf(m) is the smallest prime dividing m (A020639).
 * @author Sean A. Irvine
 */
public class A080065 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A080065() {
    super(1, new A080063(), Z.THREE::equals);
  }
}
