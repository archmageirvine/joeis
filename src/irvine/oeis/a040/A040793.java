package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040793 Continued fraction for sqrt(822).
 * @author Georg Fischer
 */
public class A040793 extends PrependSequence {

  /** Construct the sequence. */
  public A040793() {
    super(new PeriodicSequence(1, 2, 28, 2, 1, 56), Z.valueOf(28));
  }
}
