package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002034;

/**
 * A075393 Positive integers k that are not divisible by A002034(k).
 * @author Sean A. Irvine
 */
public class A075393 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A075393() {
    super(1, 1, new A002034(), (n, k) -> !Z.valueOf(n).mod(k).isZero());
  }
}
