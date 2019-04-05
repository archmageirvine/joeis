package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040386 Continued fraction for sqrt(407).
 * @author Georg Fischer
 */
public class A040386 extends PrependSequence {

  /** Construct the sequence. */
  public A040386() {
    super(new PeriodicSequence(5, 1, 2, 1, 5, 40), Z.valueOf(20));
  }
}
