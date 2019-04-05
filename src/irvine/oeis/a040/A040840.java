package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040840 Continued fraction for sqrt(870).
 * @author Georg Fischer
 */
public class A040840 extends PrependSequence {

  /** Construct the sequence. */
  public A040840() {
    super(new PeriodicSequence(2, 58), Z.valueOf(29));
  }
}
