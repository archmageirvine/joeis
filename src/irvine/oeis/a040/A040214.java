package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040214 Continued fraction for sqrt(230).
 * @author Georg Fischer
 */
public class A040214 extends PrependSequence {

  /** Construct the sequence. */
  public A040214() {
    super(new PeriodicSequence(6, 30), Z.valueOf(15));
  }
}
