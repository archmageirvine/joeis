package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040782 Continued fraction for sqrt(811).
 * @author Georg Fischer
 */
public class A040782 extends PrependSequence {

  /** Construct the sequence. */
  public A040782() {
    super(new PeriodicSequence(2, 10, 1, 8, 1, 1, 2, 1, 1, 1, 3, 6, 18, 1, 4, 1, 2, 1, 27, 1, 2, 1, 4, 1, 18, 6, 3, 1, 1, 1, 2, 1, 1, 8, 1, 10, 2, 56), Z.valueOf(28));
  }
}
