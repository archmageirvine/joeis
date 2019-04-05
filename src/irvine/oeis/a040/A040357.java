package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040357 Continued fraction for sqrt(377).
 * @author Georg Fischer
 */
public class A040357 extends PrependSequence {

  /** Construct the sequence. */
  public A040357() {
    super(new PeriodicSequence(2, 2, 2, 38), Z.valueOf(19));
  }
}
