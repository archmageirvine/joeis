package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040760 Continued fraction for sqrt(789).
 * @author Georg Fischer
 */
public class A040760 extends PrependSequence {

  /** Construct the sequence. */
  public A040760() {
    super(new PeriodicSequence(11, 4, 1, 1, 2, 3, 1, 13, 3, 1, 2, 18, 2, 1, 3, 13, 1, 3, 2, 1, 1, 4, 11, 56), Z.valueOf(28));
  }
}
