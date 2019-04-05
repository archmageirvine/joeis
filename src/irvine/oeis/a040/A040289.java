package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040289 Continued fraction for sqrt(307).
 * @author Georg Fischer
 */
public class A040289 extends PrependSequence {

  /** Construct the sequence. */
  public A040289() {
    super(new PeriodicSequence(1, 1, 11, 5, 1, 3, 17, 3, 1, 5, 11, 1, 1, 34), Z.valueOf(17));
  }
}
