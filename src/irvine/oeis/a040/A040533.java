package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040533 Continued fraction for sqrt(557).
 * @author Georg Fischer
 */
public class A040533 extends PrependSequence {

  /** Construct the sequence. */
  public A040533() {
    super(new PeriodicSequence(1, 1, 1, 1, 46), Z.valueOf(23));
  }
}
