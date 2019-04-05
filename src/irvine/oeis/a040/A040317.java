package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040317 Continued fraction for sqrt(336).
 * @author Georg Fischer
 */
public class A040317 extends PrependSequence {

  /** Construct the sequence. */
  public A040317() {
    super(new PeriodicSequence(3, 36), Z.valueOf(18));
  }
}
