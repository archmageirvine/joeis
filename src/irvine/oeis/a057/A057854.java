package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a000.A000032;

/**
 * A057854 Non-Lucas numbers: the complement of A000032.
 * @author Sean A. Irvine
 */
public class A057854 extends ComplementSequence {

  /** Construct the sequence. */
  public A057854() {
    super(Z.FIVE, new A000032().skip(1));
  }
}
