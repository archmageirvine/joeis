package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040531 Continued fraction for sqrt(555).
 * @author Georg Fischer
 */
public class A040531 extends PrependSequence {

  /** Construct the sequence. */
  public A040531() {
    super(new PeriodicSequence(1, 1, 3, 1, 3, 1, 1, 46), Z.valueOf(23));
  }
}
