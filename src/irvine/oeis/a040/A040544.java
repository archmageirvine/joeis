package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040544 Continued fraction for sqrt(568).
 * @author Georg Fischer
 */
public class A040544 extends PrependSequence {

  /** Construct the sequence. */
  public A040544() {
    super(new PeriodicSequence(1, 4, 1, 46), Z.valueOf(23));
  }
}
