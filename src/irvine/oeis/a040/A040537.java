package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040537 Continued fraction for sqrt(561).
 * @author Georg Fischer
 */
public class A040537 extends PrependSequence {

  /** Construct the sequence. */
  public A040537() {
    super(new PeriodicSequence(1, 2, 5, 1, 1, 2, 2, 2, 1, 1, 5, 2, 1, 46), Z.valueOf(23));
  }
}
