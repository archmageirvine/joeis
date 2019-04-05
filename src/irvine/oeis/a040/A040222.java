package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040222 Continued fraction for sqrt(238).
 * @author Georg Fischer
 */
public class A040222 extends PrependSequence {

  /** Construct the sequence. */
  public A040222() {
    super(new PeriodicSequence(2, 2, 1, 14, 1, 2, 2, 30), Z.valueOf(15));
  }
}
