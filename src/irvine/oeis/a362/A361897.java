package irvine.oeis.a362;

import irvine.oeis.a000.A000005;
import irvine.oeis.transform.GilbreathTransformSequence;

/**
 * A361897 Leading terms of the rows of the array in A362450; or, Gilbreath transform of tau (A000005).
 * @author Sean A. Irvine
 */
public class A361897 extends GilbreathTransformSequence {

  /** Construct the sequence. */
  public A361897() {
    super(1, new A000005());
  }
}
