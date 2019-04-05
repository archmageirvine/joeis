package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040781 Continued fraction for sqrt(810).
 * @author Georg Fischer
 */
public class A040781 extends PrependSequence {

  /** Construct the sequence. */
  public A040781() {
    super(new PeriodicSequence(2, 5, 1, 4, 1, 5, 2, 56), Z.valueOf(28));
  }
}
