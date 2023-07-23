package irvine.oeis.a064;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000203;
import irvine.oeis.a000.A000720;
import irvine.oeis.a001.A001223;

/**
 * A064677 a(n) = sigma(n) - D(n) - pi(n), where D(n)=A001223, pi(n)= A000720.
 * @author Sean A. Irvine
 */
public class A064677 extends Combiner {

  /** Construct the sequence. */
  public A064677() {
    super(1, new A000203(), new Combiner(new A001223(), new A000720(), ADD), SUBTRACT);
  }
}
