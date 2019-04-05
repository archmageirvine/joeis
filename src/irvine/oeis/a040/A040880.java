package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040880 Continued fraction for sqrt(911).
 * @author Georg Fischer
 */
public class A040880 extends PrependSequence {

  /** Construct the sequence. */
  public A040880() {
    super(new PeriodicSequence(5, 2, 8, 5, 1, 11, 4, 4, 2, 1, 1, 29, 1, 1, 2, 4, 4, 11, 1, 5, 8, 2, 5, 60), Z.valueOf(30));
  }
}
