package irvine.oeis.a081;

import irvine.oeis.InverseSequence;
import irvine.oeis.a067.A067003;

/**
 * A081376 a(n) is the least number such that A067003(a(n)) = n.
 * @author Sean A. Irvine
 */
public class A081376 extends InverseSequence {

  /** Construct the sequence. */
  public A081376() {
    super(1, new A067003());
  }
}

