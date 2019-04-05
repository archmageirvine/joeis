package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040080 Continued fraction for sqrt(90).
 * @author Georg Fischer
 */
public class A040080 extends PrependSequence {

  /** Construct the sequence. */
  public A040080() {
    super(new PeriodicSequence(2, 18), Z.valueOf(9));
  }
}
