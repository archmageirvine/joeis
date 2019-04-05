package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040820 Continued fraction for sqrt(850).
 * @author Georg Fischer
 */
public class A040820 extends PrependSequence {

  /** Construct the sequence. */
  public A040820() {
    super(new PeriodicSequence(6, 2, 6, 58), Z.valueOf(29));
  }
}
