package irvine.oeis.a190;

import irvine.oeis.a056.A056040;
import irvine.oeis.transform.EulerTransform;

/**
 * A190905 Euler transform of the swinging factorial A056040.
 * @author Georg Fischer
 */
public class A190905 extends EulerTransform {

  /** Construct the sequence. */
  public A190905() {
    super(new A056040().skip(1), 1);
  }

}
