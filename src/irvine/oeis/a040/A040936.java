package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040936 Continued fraction for sqrt(968).
 * @author Georg Fischer
 */
public class A040936 extends PrependSequence {

  /** Construct the sequence. */
  public A040936() {
    super(new PeriodicSequence(8, 1, 6, 1, 8, 62), Z.valueOf(31));
  }
}
