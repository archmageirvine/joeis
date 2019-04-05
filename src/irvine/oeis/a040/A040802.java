package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040802 Continued fraction for sqrt(831).
 * @author Georg Fischer
 */
public class A040802 extends PrependSequence {

  /** Construct the sequence. */
  public A040802() {
    super(new PeriodicSequence(1, 4, 1, 3, 1, 1, 1, 1, 18, 1, 1, 1, 1, 3, 1, 4, 1, 56), Z.valueOf(28));
  }
}
