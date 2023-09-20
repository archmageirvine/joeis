package irvine.oeis.a362;

import irvine.oeis.a000.A000203;
import irvine.oeis.transform.GilbreathTransformSequence;

/**
 * A362451 Gilbreath transform of {sigma(i), i &gt;= 1} (cf. A000203).
 * @author Sean A. Irvine
 */
public class A362451 extends GilbreathTransformSequence {

  /** Construct the sequence. */
  public A362451() {
    super(1, new A000203());
  }
}
