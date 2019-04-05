package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040958 Continued fraction for sqrt(990).
 * @author Georg Fischer
 */
public class A040958 extends PrependSequence {

  /** Construct the sequence. */
  public A040958() {
    super(new PeriodicSequence(2, 6, 2, 62), Z.valueOf(31));
  }
}
