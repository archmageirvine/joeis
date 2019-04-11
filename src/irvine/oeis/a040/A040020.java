package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040020 Continued fraction for <code>sqrt(26)</code>.
 * @author Georg Fischer
 */
public class A040020 extends PrependSequence {

  /** Construct the sequence. */
  public A040020() {
    super(new PeriodicSequence(10), Z.valueOf(5));
  }
}
