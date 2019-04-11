package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040879 Continued fraction for <code>sqrt(910)</code>.
 * @author Georg Fischer
 */
public class A040879 extends PrependSequence {

  /** Construct the sequence. */
  public A040879() {
    super(new PeriodicSequence(6, 60), Z.valueOf(30));
  }
}
