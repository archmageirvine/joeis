package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076030 Square roots of products of members of groups in A076031.
 * @author Sean A. Irvine
 */
public class A076030 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076030() {
    super(new A076029(), Z::sqrt);
  }
}
