package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a082.A082042;

/**
 * A018932.
 * @author Sean A. Irvine
 */
public class A018932 extends PrependSequence {

  /** Construct the sequence. */
  public A018932() {
    super(new SkipSequence(new A082042(), 2), Z.ZERO, Z.THREE);
  }
}

