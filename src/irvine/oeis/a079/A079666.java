package irvine.oeis.a079;

import irvine.oeis.InverseSequence;
import irvine.oeis.a060.A060272;

/**
 * A079666 Least k such that the distance from k^2 to closest prime = n or zero if no k exists.
 * @author Sean A. Irvine
 */
public class A079666 extends InverseSequence {

  /** Construct the sequence. */
  public A079666() {
    super(1, new A060272());
  }
}

