package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146313 <code>a(n) =</code> cosh( <code>(2n -</code> 1)*arcsinh(sqrt(2)) <code>)^2 = 1 -</code> cos( <code>(2n -</code> 1)*arcsin(sqrt(3)) <code>)^2</code>.
 * @author Sean A. Irvine
 */
public class A146313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146313() {
    super(new long[] {1, -99, 99}, new long[] {3, 243, 23763});
  }
}
