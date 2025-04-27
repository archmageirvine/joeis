package irvine.oeis.a077;

import irvine.oeis.a064.A064731;
import irvine.oeis.transform.EulerTransform;

/**
 * A077027 Number of simple integral graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A077027 extends EulerTransform {

  /** Construct the sequence. */
  public A077027() {
    super(1, new A064731());
  }
}
