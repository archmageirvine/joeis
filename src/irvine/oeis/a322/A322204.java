package irvine.oeis.a322;
// manually euleras at 2021-11-23 12:41

import irvine.oeis.EulerTransform;
import irvine.oeis.SkipSequence;
import irvine.oeis.a003.A003239;

/**
 * A322204 G.f.: exp( Sum_{n&gt;=1} A322203(n)*x^n/n ), where A322203(n) is the coefficient of x^n*y^n/n in Sum_{n&gt;=1} -log(1 - (x^n + y^n)).
 * @author Georg Fischer
 */
public class A322204 extends EulerTransform {

  /** Construct the sequence. */
  public A322204() {
    super(new SkipSequence(new A003239(), 1), 1);
  }
}
