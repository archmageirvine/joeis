package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040545 Continued fraction for sqrt(569).
 * @author Georg Fischer
 */
public class A040545 extends PrependSequence {

  /** Construct the sequence. */
  public A040545() {
    super(new PeriodicSequence(1, 5, 1, 5, 9, 2, 1, 2, 3, 3, 2, 1, 2, 9, 5, 1, 5, 1, 46), Z.valueOf(23));
  }
}
