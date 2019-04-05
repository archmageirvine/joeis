package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040784 Continued fraction for sqrt(813).
 * @author Georg Fischer
 */
public class A040784 extends PrependSequence {

  /** Construct the sequence. */
  public A040784() {
    super(new PeriodicSequence(1, 1, 18, 1, 1, 56), Z.valueOf(28));
  }
}
