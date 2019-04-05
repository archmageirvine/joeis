package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040507 Continued fraction for sqrt(531).
 * @author Georg Fischer
 */
public class A040507 extends PrependSequence {

  /** Construct the sequence. */
  public A040507() {
    super(new PeriodicSequence(23, 46), Z.valueOf(23));
  }
}
