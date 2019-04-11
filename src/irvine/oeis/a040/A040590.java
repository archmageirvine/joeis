package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040590 Continued fraction for <code>sqrt(615)</code>.
 * @author Georg Fischer
 */
public class A040590 extends PrependSequence {

  /** Construct the sequence. */
  public A040590() {
    super(new PeriodicSequence(1, 3, 1, 48), Z.valueOf(24));
  }
}
