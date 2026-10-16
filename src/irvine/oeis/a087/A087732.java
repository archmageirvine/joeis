package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A087732 Smaller of twin primes of the form P=j*P(i)#-1 and P=j*P(i)#+1 with 0 &lt; j &lt; P(i+1), where P(i) denotes i-th prime and P(i)# the i-th primorial number A002110(i).
 * @author Sean A. Irvine
 */
public class A087732 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A087732() {
    super(1, 1, 1, (j, i) -> j < Functions.PRIME.i(i + 1) ? Functions.PRIMORIAL_COUNT.z(i).multiply(j) : null);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().subtract(1);
      if (t.isProbablePrime() && t.add(2).isProbablePrime()) {
        return t;
      }
    }
  }
}

