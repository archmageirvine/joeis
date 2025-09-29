package irvine.oeis.a080;

import irvine.oeis.a000.A000201;
import irvine.oeis.transform.AronsonTransform;

/**
 * A080760 Aronson transform of lower Wythoff sequence A000201.
 * @author Sean A. Irvine
 */
public class A080760 extends AronsonTransform {

  /** Construct the sequence. */
  public A080760() {
    super(new A000201());
  }
}

