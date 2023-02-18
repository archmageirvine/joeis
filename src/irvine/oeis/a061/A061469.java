package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a002.A002025;
import irvine.oeis.a002.A002046;

/**
 * A061469 GCD of the amicable pairs: a(n) = gcd(A002025(n), A002046(n)).
 * @author Sean A. Irvine
 */
public class A061469 extends Combiner {

  /** Construct the sequence. */
  public A061469() {
    super(new A002025(), new A002046(), Z::gcd);
  }
}

