package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040031 Continued fraction for sqrt(38).
 * @author Georg Fischer
 */
public class A040031 extends PrependSequence {

  /** Construct the sequence. */
  public A040031() {
    super(new PeriodicSequence(6, 12), Z.valueOf(6));
  }
}
