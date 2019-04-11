package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040021 Continued fraction for <code>sqrt(27)</code>.
 * @author Georg Fischer
 */
public class A040021 extends PrependSequence {

  /** Construct the sequence. */
  public A040021() {
    super(new PeriodicSequence(5, 10), Z.valueOf(5));
  }
}
