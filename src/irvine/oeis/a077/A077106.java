package irvine.oeis.a077;

import irvine.oeis.a000.A000290;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077106 Largest integer cube &lt;= n^2.
 * @author Sean A. Irvine
 */
public class A077106 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077106() {
    super(0, new A000290(), k -> k.root(3).pow(3));
  }
}

