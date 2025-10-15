package irvine.oeis.a077;

import irvine.oeis.InverseSequence;
import irvine.oeis.a051.A051699;

/**
 * A077019 a(n) is the smallest number for which the prime distance A051699 is equal to n.
 * @author Sean A. Irvine
 */
public class A077019 extends InverseSequence {

  /** Construct the sequence. */
  public A077019() {
    super(0, 0, new A051699());
  }
}
