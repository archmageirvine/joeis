package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040929 Continued fraction for sqrt(960).
 * @author Georg Fischer
 */
public class A040929 extends PrependSequence {

  /** Construct the sequence. */
  public A040929() {
    super(new PeriodicSequence(1, 60), Z.valueOf(30));
  }
}
