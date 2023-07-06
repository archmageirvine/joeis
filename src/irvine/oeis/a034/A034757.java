package irvine.oeis.a034;

import irvine.oeis.a005.A005282;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A034757 a(1)=1, a(n) = smallest odd number such that all sums of pairs of (not necessarily distinct) terms in the sequence are distinct.
 * @author Sean A. Irvine
 */
public class A034757 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A034757() {
    super(new A005282(), k -> k.multiply2().subtract(1));
  }
}
