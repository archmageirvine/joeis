package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040675 Continued fraction for sqrt(702).
 * @author Georg Fischer
 */
public class A040675 extends PrependSequence {

  /** Construct the sequence. */
  public A040675() {
    super(new PeriodicSequence(2, 52), Z.valueOf(26));
  }
}
