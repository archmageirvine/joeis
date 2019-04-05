package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040795 Continued fraction for sqrt(824).
 * @author Georg Fischer
 */
public class A040795 extends PrependSequence {

  /** Construct the sequence. */
  public A040795() {
    super(new PeriodicSequence(1, 2, 2, 1, 1, 6, 1, 1, 2, 2, 1, 56), Z.valueOf(28));
  }
}
