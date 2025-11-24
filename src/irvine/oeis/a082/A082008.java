package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082008 a(n) = A082007(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A082008 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082008() {
    super(1, new A082007(), Z.ONE::add);
  }
}
