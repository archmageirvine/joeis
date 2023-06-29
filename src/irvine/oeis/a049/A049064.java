package irvine.oeis.a049;

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001391;

/**
 * A049064 Describe the previous term in binary (method A - initial term is 0).
 * @author Sean A. Irvine
 */
public class A049064 extends PrependSequence {

  /** Construct the sequence. */
  public A049064() {
    super(1, new A001391(), 0);
  }
}
