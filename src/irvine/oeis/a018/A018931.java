package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a062.A062119;

/**
 * A018931 The number of permutations of n cards in which 2 is the first card hit and 3 the next hit after 2.
 * @author Sean A. Irvine
 */
public class A018931 extends PrependSequence {

  /** Construct the sequence. */
  public A018931() {
    super(new SkipSequence(new A062119(), 1), Z.ZERO, Z.ONE);
  }
}

