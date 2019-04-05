package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040282 Continued fraction for sqrt(300).
 * @author Georg Fischer
 */
public class A040282 extends PrependSequence {

  /** Construct the sequence. */
  public A040282() {
    super(new PeriodicSequence(3, 8, 3, 34), Z.valueOf(17));
  }
}
