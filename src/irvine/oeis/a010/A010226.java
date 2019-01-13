package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010226.
 * @author Sean A. Irvine
 */
public class A010226 extends PrependSequence {

  /** Construct the sequence. */
  public A010226() {
    super(new PeriodicSequence(1, 1, 3, 2, 1, 2, 1, 2, 3, 1, 1, 26), Z.valueOf(13));
  }
}

