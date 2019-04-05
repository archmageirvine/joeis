package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040790 Continued fraction for sqrt(819).
 * @author Georg Fischer
 */
public class A040790 extends PrependSequence {

  /** Construct the sequence. */
  public A040790() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 1, 1, 1, 1, 56), Z.valueOf(28));
  }
}
