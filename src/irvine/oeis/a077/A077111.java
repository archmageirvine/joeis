package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077111 a(n) = A077110(n) - n^2.
 * @author Sean A. Irvine
 */
public class A077111 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077111() {
    super(0, new A000290(), k -> {
      final Z root = k.root(3);
      final Z lo = root.pow(3);
      final Z hi = root.add(1).pow(3);
      return (k.subtract(lo).compareTo(hi.subtract(k)) <= 0 ? lo : hi).subtract(k);
    });
  }
}

