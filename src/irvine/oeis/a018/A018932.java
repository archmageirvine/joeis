package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a082.A082042;

/**
 * A018932 The number of permutations of n cards in which 4 will be the next hit after 2.
 * @author Sean A. Irvine
 */
public class A018932 extends PrependSequence {

  /** Construct the sequence. */
  public A018932() {
    super(new SkipSequence(new A082042(), 2), Z.ZERO, Z.THREE);
  }
}

