package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040011 Continued fraction for sqrt(15).
 * @author Georg Fischer
 */
public class A040011 extends PrependSequence {

  /** Construct the sequence. */
  public A040011() {
    super(new PeriodicSequence(1, 6), Z.valueOf(3));
  }
}
