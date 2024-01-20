package irvine.oeis.a051;

import irvine.oeis.a004.A004593;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A051482 Run lengths in binary expansion of e.
 * @author Sean A. Irvine
 */
public class A051482 extends RunLengthTransform {

  /** Construct the sequence. */
  public A051482() {
    super(1, new A004593());
  }
}
