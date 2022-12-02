package irvine.oeis.a236;

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a079.A079599;

/**
 * A236677 a(0)=1; for n&gt;0, a(n) = (1-a(floor(log_2(n)))) * a(n-msb(n)); characteristic function of A079599.
 * @author Georg Fischer
 */
public class A236677 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A236677() {
    super(0, new A079599(), true, 4);
  }

}
