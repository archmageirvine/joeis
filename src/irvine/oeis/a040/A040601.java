package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040601 Continued fraction for sqrt(627).
 * @author Georg Fischer
 */
public class A040601 extends PrependSequence {

  /** Construct the sequence. */
  public A040601() {
    super(new PeriodicSequence(25, 50), Z.valueOf(25));
  }
}
