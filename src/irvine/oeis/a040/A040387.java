package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040387 Continued fraction for sqrt(408).
 * @author Georg Fischer
 */
public class A040387 extends PrependSequence {

  /** Construct the sequence. */
  public A040387() {
    super(new PeriodicSequence(5, 40), Z.valueOf(20));
  }
}
