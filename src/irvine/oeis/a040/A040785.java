package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040785 Continued fraction for sqrt(814).
 * @author Georg Fischer
 */
public class A040785 extends PrependSequence {

  /** Construct the sequence. */
  public A040785() {
    super(new PeriodicSequence(1, 1, 7, 1, 1, 1, 5, 18, 1, 5, 2, 1, 1, 4, 1, 1, 2, 5, 1, 18, 5, 1, 1, 1, 7, 1, 1, 56), Z.valueOf(28));
  }
}
