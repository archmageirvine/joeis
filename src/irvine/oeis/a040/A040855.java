package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040855 Continued fraction for sqrt(885).
 * @author Georg Fischer
 */
public class A040855 extends PrependSequence {

  /** Construct the sequence. */
  public A040855() {
    super(new PeriodicSequence(1, 2, 1, 58), Z.valueOf(29));
  }
}
