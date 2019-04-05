package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040350 Continued fraction for sqrt(370).
 * @author Georg Fischer
 */
public class A040350 extends PrependSequence {

  /** Construct the sequence. */
  public A040350() {
    super(new PeriodicSequence(4, 4, 38), Z.valueOf(19));
  }
}
