package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040771 Continued fraction for sqrt(800).
 * @author Georg Fischer
 */
public class A040771 extends PrependSequence {

  /** Construct the sequence. */
  public A040771() {
    super(new PeriodicSequence(3, 1, 1, 13, 1, 1, 3, 56), Z.valueOf(28));
  }
}
