package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040551 Continued fraction for sqrt(575).
 * @author Georg Fischer
 */
public class A040551 extends PrependSequence {

  /** Construct the sequence. */
  public A040551() {
    super(new PeriodicSequence(1, 46), Z.valueOf(23));
  }
}
