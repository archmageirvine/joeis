package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040390 Continued fraction for sqrt(411).
 * @author Georg Fischer
 */
public class A040390 extends PrependSequence {

  /** Construct the sequence. */
  public A040390() {
    super(new PeriodicSequence(3, 1, 1, 1, 19, 1, 1, 1, 3, 40), Z.valueOf(20));
  }
}
