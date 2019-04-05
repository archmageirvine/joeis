package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040816 Continued fraction for sqrt(846).
 * @author Georg Fischer
 */
public class A040816 extends PrependSequence {

  /** Construct the sequence. */
  public A040816() {
    super(new PeriodicSequence(11, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 11, 58), Z.valueOf(29));
  }
}
