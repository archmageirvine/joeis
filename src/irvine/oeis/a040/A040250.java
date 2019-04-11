package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040250 Continued fraction for <code>sqrt(267)</code>.
 * @author Georg Fischer
 */
public class A040250 extends PrependSequence {

  /** Construct the sequence. */
  public A040250() {
    super(new PeriodicSequence(2, 1, 15, 1, 2, 32), Z.valueOf(16));
  }
}
