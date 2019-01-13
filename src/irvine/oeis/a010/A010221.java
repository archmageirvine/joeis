package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010221.
 * @author Sean A. Irvine
 */
public class A010221 extends PrependSequence {

  /** Construct the sequence. */
  public A010221() {
    super(new PeriodicSequence(3, 3, 2, 8, 2, 3, 3, 26), Z.valueOf(13));
  }
}

