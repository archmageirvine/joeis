package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010218.
 * @author Sean A. Irvine
 */
public class A010218 extends PrependSequence {

  /** Construct the sequence. */
  public A010218() {
    super(new PeriodicSequence(5, 4, 5, 26), Z.valueOf(13));
  }
}

