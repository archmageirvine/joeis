package irvine.oeis.a362;

import irvine.oeis.a001.A001065;
import irvine.oeis.transform.GilbreathTransformSequence;

/**
 * A362452 Gilbreath transform of {sigma(i)-i, i &gt;= 1} (see sum of aliquot parts, A001065).
 * @author Sean A. Irvine
 */
public class A362452 extends GilbreathTransformSequence {

  /** Construct the sequence. */
  public A362452() {
    super(1, new A001065());
  }
}
