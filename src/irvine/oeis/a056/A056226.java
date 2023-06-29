package irvine.oeis.a056;

import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008683;
import irvine.oeis.transform.LittleHankelTransform;

/**
 * A056226 Image of Moebius function (A008683) under "little Hankel" transform that sends [c_0, c_1, ...] to [d_0, d_1, ...] where d_n = c_n^2 - c_{n+1}*c_{n-1}.
 * @author Sean A. Irvine
 */
public class A056226 extends PrependSequence {

  /** Construct the sequence. */
  public A056226() {
    super(1, new LittleHankelTransform(new A008683()), 0);
  }
}
