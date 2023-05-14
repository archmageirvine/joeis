package irvine.oeis.a063;

import irvine.oeis.InverseSequence;
import irvine.oeis.a129.A129654;

/**
 * A063778 a(n) = the least integer that is polygonal in exactly n ways.
 * @author Sean A. Irvine
 */
public class A063778 extends InverseSequence {

  /** Construct the sequence. */
  public A063778() {
    super(new A129654(), 2, 2);
  }
}
