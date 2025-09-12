package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080310 Rewrite 0-&gt;100 in the binary expansion of n (but leaving single zero as zero) and append 10 to the right.
 * @author Sean A. Irvine
 */
public class A080310 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080310() {
    super(0, new A080303(), (n, k) -> n == 0 ? Z.TWO : k.shiftLeft(2).add(2));
  }
}
