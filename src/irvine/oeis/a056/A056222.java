package irvine.oeis.a056;

import irvine.oeis.a000.A000041;
import irvine.oeis.transform.LittleHankelTransform;

/**
 * A056222 Image of partition numbers (A000041) under "little Hankel" transform that sends [c_0, c_1, ...] to [d_0, d_1, ...] where d_n = c_n^2 - c_{n+1}*c_{n-1}.
 * @author Sean A. Irvine
 */
public class A056222 extends LittleHankelTransform {

  /** Construct the sequence. */
  public A056222() {
    super(0, new A000041());
  }
}
