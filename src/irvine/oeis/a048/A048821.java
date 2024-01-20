package irvine.oeis.a048;

import irvine.oeis.transform.RunLengthTransform;

/**
 * A048821 Lengths of runs in A048820.
 * @author Sean A. Irvine
 */
public class A048821 extends RunLengthTransform {

  /** Construct the sequence. */
  public A048821() {
    super(0, new A048820());
  }
}

