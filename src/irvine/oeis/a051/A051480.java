package irvine.oeis.a051;

import irvine.oeis.a004.A004601;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A051480 Run lengths in binary expansion of Pi.
 * @author Sean A. Irvine
 */
public class A051480 extends RunLengthTransform {

  /** Construct the sequence. */
  public A051480() {
    super(1, new A004601());
  }
}
