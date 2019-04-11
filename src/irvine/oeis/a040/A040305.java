package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040305 Continued fraction for <code>sqrt(323)</code>.
 * @author Georg Fischer
 */
public class A040305 extends PrependSequence {

  /** Construct the sequence. */
  public A040305() {
    super(new PeriodicSequence(1, 34), Z.valueOf(17));
  }
}
