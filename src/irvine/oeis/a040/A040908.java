package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040908 Continued fraction for sqrt(939).
 * @author Georg Fischer
 */
public class A040908 extends PrependSequence {

  /** Construct the sequence. */
  public A040908() {
    super(new PeriodicSequence(1, 1, 1, 4, 20, 4, 1, 1, 1, 60), Z.valueOf(30));
  }
}
