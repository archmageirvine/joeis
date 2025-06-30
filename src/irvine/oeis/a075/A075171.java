package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075171 Nonnegative integers mapped to Dyck path encodings of the rooted plane trees obtained by recursing on the run lengths of the binary expansion of n.
 * @author Sean A. Irvine
 */
public class A075171 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075171() {
    super(0, new A075170(), k -> new Z(k.toString(2)));
  }
}
