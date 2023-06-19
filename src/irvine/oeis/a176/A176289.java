package irvine.oeis.a176;

import irvine.oeis.PrependSequence;
import irvine.oeis.a027.A027642;

/**
 * A176289 Denominators of the rational sequence with e.g.f. (x/2)*(1+exp(-x))/(1-exp(-x)).
 * @author Georg Fischer
 */
public class A176289 extends PrependSequence {

  /** Construct the sequence. */
  public A176289() {
    super(new A027642().skip(2), 1, 1);
  }
}
