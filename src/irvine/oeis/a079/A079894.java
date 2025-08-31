package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.Combiner;

/**
 * A079894 a(n) = gcd(A079890(n), A079892(n)).
 * @author Sean A. Irvine
 */
public class A079894 extends Combiner {

  /** Construct the sequence. */
  public A079894() {
    super(new A079890(), new A079892(), Functions.GCD::z);
  }
}

