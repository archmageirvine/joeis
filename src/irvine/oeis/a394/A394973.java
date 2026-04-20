package irvine.oeis.a394;

import irvine.oeis.InverseSequence;
import irvine.oeis.a091.A091508;

/**
 * A394973 a(n) is the smallest k such that A091508(k) = n.
 * @author Sean A. Irvine
 */
public class A394973 extends InverseSequence {

  /** Construct the sequence. */
  public A394973() {
    super(1, 1, new A091508());
  }
}
