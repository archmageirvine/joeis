package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a062.A062119;

/**
 * A018931.
 * @author Sean A. Irvine
 */
public class A018931 extends PrependSequence {

  /** Construct the sequence. */
  public A018931() {
    super(new SkipSequence(new A062119(), 1), Z.ZERO, Z.ONE);
  }
}

