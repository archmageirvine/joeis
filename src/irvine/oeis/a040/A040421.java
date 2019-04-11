package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040421 Continued fraction for <code>sqrt(443)</code>.
 * @author Georg Fischer
 */
public class A040421 extends PrependSequence {

  /** Construct the sequence. */
  public A040421() {
    super(new PeriodicSequence(21, 42), Z.valueOf(21));
  }
}
