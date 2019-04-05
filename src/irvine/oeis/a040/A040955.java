package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040955 Continued fraction for sqrt(987).
 * @author Georg Fischer
 */
public class A040955 extends PrependSequence {

  /** Construct the sequence. */
  public A040955() {
    super(new PeriodicSequence(2, 2, 2, 62), Z.valueOf(31));
  }
}
