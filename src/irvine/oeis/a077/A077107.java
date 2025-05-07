package irvine.oeis.a077;

import irvine.oeis.a000.A000290;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077107 Least integer cube &gt;= n^2.
 * @author Sean A. Irvine
 */
public class A077107 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077107() {
    super(0, new A000290(), k -> k.subtract(1).root(3).add(1).pow(3));
  }
}

