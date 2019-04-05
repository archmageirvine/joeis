package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040283 Continued fraction for sqrt(301).
 * @author Georg Fischer
 */
public class A040283 extends PrependSequence {

  /** Construct the sequence. */
  public A040283() {
    super(new PeriodicSequence(2, 1, 6, 3, 1, 2, 2, 1, 1, 8, 11, 2, 4, 2, 11, 8, 1, 1, 2, 2, 1, 3, 6, 1, 2, 34), Z.valueOf(17));
  }
}
