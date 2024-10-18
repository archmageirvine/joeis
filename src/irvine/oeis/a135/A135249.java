package irvine.oeis.a135;

import irvine.math.z.Z;
import irvine.oeis.a070.A070826;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A135249 a(n) = number of bits in the binary expansion of A046967(n).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A135249 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A135249() {
    super(1, new A070826(), Z.ONE::add);
  }
}
