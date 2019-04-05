package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040652 Continued fraction for sqrt(679).
 * @author Georg Fischer
 */
public class A040652 extends PrependSequence {

  /** Construct the sequence. */
  public A040652() {
    super(new PeriodicSequence(17, 2, 1, 5, 8, 1, 1, 25, 1, 1, 8, 5, 1, 2, 17, 52), Z.valueOf(26));
  }
}
